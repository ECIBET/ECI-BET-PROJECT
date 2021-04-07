bets = (function () {
var equipoCuota;
var idPartido;

    bet = function (){
        if (localStorage.getItem("Authorization") !== "") {
            apiclient.obtenerApuestas(drawBet,localStorage.getItem("Authorization"));
        } else {
            alert("Debe ingresar algún nombre, vuelva a intentarlo")
        }
    }

    drawBet = function(resp){
        $("#betsTable tbody").empty();
        //console.log(typeof(resp));
        if(resp !== undefined){
            var data = resp.map((info) => {
                return {
                    idApuesta: info.idApuesta,
                    hora: info.hora,
                    fecha: info.fecha,
                    logo1: info.logo1,
                    logo2: info.logo2,
                    equipo1: info.equipo1,
                    equipo2: info.equipo2,
                    cuota1: info.cuota1,
                    cuotaEmpate: info.cuotaEmpate,
                    cuota2: info.cuota2
                }
            })
            data.map((info) => {
                $("#betsTable > tbody:last").append($("<tr><td>" + info.fecha + "<br>" + info.hora +
                                                      `</td><td><img src="assets/images/icons/teams/${info.logo1}"><br>` +
                                                      `<img src="assets/images/icons/teams/${info.logo2}">`+
                                                      "</td><td>" + info.equipo1 +"<br>"+ info.equipo2 +
                                                      `</td><td><a id="${info.equipo1}" name ="${info.idApuesta}" type="button" class="btnn" data-toggle="modal" onclick="bets.updateCuota(${info.cuota1},this.id, this.name)" data-target="#myModal">${info.cuota1}</a>` +
                                                      `</td><td><a id="${info.equipo1}&${info.equipo2}" name ="${info.idApuesta}" type="button" class="btnn" data-toggle="modal" onclick="bets.updateCuota(${info.cuotaEmpate},this.id, this.name)" data-target="#myModal">${info.cuotaEmpate}</a>` +
                                                      `</td><td><a id="${info.equipo2}" name ="${info.idApuesta}" type="button" class="btnn" data-toggle="modal" onclick="bets.updateCuota(${info.cuota2},this.id, this.name)" data-target="#myModal">${info.cuota2}</a>`+
                                                      `</td><td><a href="/tables/premierleague"><img src="assets/images/icons/stat.png" alt=""></a>` +
                                                      "</td></tr>"))
            })
        } else {
            alert("No existe las apuestas")
        }
    }

    updateCuota = function(cuota,equipoC,id){
        var integer = parseFloat(cuota)
        equipoCuota = equipoC;
        idPartido = id;
        document.getElementById("cuotaApuesta").value = integer;
        localStorage.setItem("cuota",cuota);
    }

    saveBet = function(pago,plata){
        //console.log(localStorage.getItem("cuota"))
        //console.log(equipoCuota)
        //console.log(plata)
        var jsonApuesta = `{
            "idUser": ${localStorage.getItem("id")},
            "idPartido": ${idPartido},
            "equipoApuesta": ${equipoCuota},
            "cuota": ${localStorage.getItem("cuota")},
            "valorApostado": ${plata}
        }`;
       // console.log(jsonApuesta)
        apiclient.guardarApuestas(localStorage.getItem("Authorization"),localStorage.getItem("id"),jsonApuesta);
    }
    askBet = function(){
            apiclient.obtenerApuestasUsuario(localStorage.getItem("Authorization"),localStorage.getItem("id"));
        }

    return{
       bet:bet,
       updateCuota : updateCuota,
       saveBet : saveBet,
       askBet : askBet

    }
})();