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
    function table(){


    }

    return {
        getToken: getToken,
        onload : onload
    }
})();
