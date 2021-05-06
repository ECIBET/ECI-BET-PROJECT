var app = (function () {
    var token;
    function getToken(newToken) {
            token = newToken.access_token;
            correo = localStorage.getItem("correo");
            localStorage.setItem("Authorization", token);
            location.href = "/indexLogin.html";

    }
    function onload() {
            if (localStorage.getItem("Authorization") === null) {
                location.href = "/";
                return
            }
    }
    function createTable(){
        if (localStorage.getItem("Authorization") !== null) {
            apiclient.obtenerApuestas();
            return
        }
    }
    function onloadBets() {
        bets.bet()
        if (localStorage.getItem("Authorization") !== null) {
             onloadUsuario();
             return
        }

    }
    function onloadUserBets() {
        bets.askBet()
        if (localStorage.getItem("Authorization") !== null) {
            onloadUsuario();
            return
        }

    }


    function onloadUsuario() {
            apiclient.obtenerUsuarioCorreo(localStorage.getItem("correo"), localStorage.getItem("Authorization"), cargarInformacion);
    }

    function cargarInformacion(Usuario) {
            //console.log("llego a cargarInformacion")
            localStorage.setItem("id", Usuario.id);
    }

    return {
        getToken: getToken,
        onload : onload,
        onloadBets : onloadBets,
        onloadUserBets : onloadUserBets
    }
})();
