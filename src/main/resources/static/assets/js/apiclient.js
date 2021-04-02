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
                        console.log("Llego al OK")
                        console.info("OK");
                        localStorage.setItem("correo", correo);
                        callback(data);
                    }, function (data) {
                        console.log("No llego al OK")
                        console.info(data)
                        console.info("Credenciales incorrectas");

                    });
        },
        obtenerApuestas(callback,token){
                var promise = $.ajax({
                  "url": "/tables/bets",
                  "method": "GET",
                  "timeout": 0,
                  "headers": {
                    "Authorization": "Bearer "+token
                  },
                  "Content-Type": "application/json"
                });
                promise.then(function (data) {
                                console.log("Llego al OK")
                                console.info("OK");
                                callback(data);
                            }, function (data) {
                                console.log("No llego al OK")
                                console.info(data)
                                console.info("No hay informacion");

                            });
        }

    }

})();