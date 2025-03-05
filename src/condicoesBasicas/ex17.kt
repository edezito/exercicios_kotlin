class ex17(){
    fun carroKm(){
        println("Qual a velocidade do carro?")
        val velocidade = readln()
        if (velocidade.toInt() > 80){
            val valorMulta = (velocidade.toInt() - 80) * 5
            println("Você foi multado!")
            println("Valor da multa: $valorMulta R$")
        }
        else{
            println("Velocidade $velocidade. Dentro do limite de velocidade")
        }
    }
}

fun main (){
    ex17().carroKm()
}