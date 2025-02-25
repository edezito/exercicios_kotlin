class distancia (){
    fun distanciaMetros(){
        println("Digite uma distância em metros")
        val dis = readln()
        val km = dis.toDouble() / 1000
        val hm = dis.toDouble() / 100
        val dam = dis.toDouble() / 10
        val dm = dis.toDouble() * 10
        val cm = dis.toDouble() * 100
        val mm = dis.toDouble() * 1000
        println("Convertendo $dis M" +
                "$km km" +
                "$hm hm" +
                "$dam dam" +
                "$dm dm" +
                "$cm cm" +
                "$mm mm")
    }
}