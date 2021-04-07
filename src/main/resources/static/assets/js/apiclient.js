var apiclient = (function () {

    return {
        obtenerTocken(correo,password,callback){
        var promise = $.ajax({
          "url": "/oauth/token",
          "method": "POST",
          "timeout": 0,
          "headers": {
            "Authorization": "Basic RWNpQmV0OkhvbGExMjM0",
            "Content-Type": "application/x-www-form-urlencoded"
          },
          "data": {
            username: correo,
            password: password,
            "grant_type": "password"
          },
          contentType: "application/x-www-form-urlencoded"
        });
        promise.then(function (data) {
                        //console.log("Llego al OK")
                        console.info("OK");
                        localStorage.setItem("correo", correo);
                        callback(data);
                    }, function (data) {
                        //console.log("No llego al OK")
                        console.info(data)
                        console.info("Credenciales incorrectas");

                    });
        },
        obtenerApuestas(callback,token){
           jQuery.ajax({
             url: "/tables/bets",
             type: 'GET',
             contentType: "application/json",
             success: function (result) {
                 callback(result);
             },
              async: true
           });
        },
        obtenerApuestasUsuario(token,id){
                   jQuery.ajax({
                     url: "/tables/apuestas/"+id,
                     type: 'GET',
                     headers: {"Authorization" : "Bearer "+token},
                     contentType: "application/json",
                     async: true
                   });
                },
        obtenerUsuarioCorreo(correo, token, callback){
                    //console.log(token);
                    var promise = $.ajax({
                        url: "/usuarios/correos/"+correo,
                        type: 'GET',
                        headers: {"Authorization" : "Bearer "+token},
                        contentType: "application/json"
                    });
                    promise.then(function (data) {
                        console.info("OK");
                        //console.log(data)
                        callback(data);
                    }, function (data) {
                        console.info(data)
                        console.info("Credenciales incorrectas");
                    });
        },
        guardarApuestas(token,id,apuesta){
        //var pr=JSON.stringify(apuesta)

            //console.log(apuesta);
            var promise = $.ajax({
                      "url": "/tables/"+id+"/apuestas",
                      "method": "POST",
                      "timeout": 0,
                      "headers": {
                        "Authorization": "Bearer "+token,
                        "Content-Type": "application/json"

                      },
                      "data": apuesta
                      });
                      console.log(apuesta)

                    promise.then(function (data) {
                        console.info("OK");
                    }, function (data) {
                        console.info("ERROR");
                    });
        }
    }
})();