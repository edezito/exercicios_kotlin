class ex18(){
    fun vota(){
        println("Digite seu ano de nascimento: ")
        val nascimento = readln()
        val permitidoVotar = 2025 - nascimento.toInt()
        if (permitidoVotar >= 18){
            println("Você tem $permitidoVotar anos é permitido votar")
        }
        else{
            println("Você tem $permitidoVotar anos não é permitido votar.")
        }
    }
}

fun main(){
    ex18().vota()
}