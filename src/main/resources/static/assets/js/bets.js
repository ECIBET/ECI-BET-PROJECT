bets = (function () {

    bet = function (){
        //console.log("Llegue perras");

        apiclient.obtenerApuestas();
    }

    return{
       bet:bet
    }
})();