class ex24 {
    fun distanciaPassageiro(){
        println("Distância que deseja perocrrer em km: ")
        val distancia = readln()
        val precoPorKm = if (distancia.toDouble() <= 200) 0.50 else 0.45
        val precoTotal = distancia.toDouble() * precoPorKm

        println("O valor da passagem para $distancia Km é R$ %.2f".format(precoTotal))
    }
}

fun main (){
    ex24().distanciaPassageiro()
}