class cigaro(){
    fun cigarrosFumados(){
        println("Quantos cigarros você fuma por dia? ")
        val cigarrosPorDia = readln().toInt()
        println("Há quantos anos você fuma? ")
        val anosFumando = readln().toInt()

        val diasFumando = anosFumando * 365
        val totalCigarros = cigarrosPorDia * diasFumando
        val minutosPerdidos = totalCigarros * 10
        val horasPerdidas = minutosPerdidos / 60
        val diasPerdidos = horasPerdidas / 24

        println("Você perdeu aproximadamente $diasPerdidos dias de vida devido ao tabagismo.")
    }
    }
