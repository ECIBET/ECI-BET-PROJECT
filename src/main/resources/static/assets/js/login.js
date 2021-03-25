login = (function () {

    login = function (){
        //console.log("Llegue perras");
        correo = $("#user").val();
        //console.log(correo);
        password = $("#password").val();
        //console.log(password);
        apiclient.obtenerTocken(correo,password,isLogin);
    }
    function cerrarSesion(){
        localStorage.clear();
        location.reload();
        location.href = "/";


    }
    function isLogin(token){
        app.getToken(token);
    }
    return{
        cerrarSesion:cerrarSesion,
        login:login
    }
})();