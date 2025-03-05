class ex19 {
    fun aprovado(){
        println("Digite seu nome: ")
        val nome = readln()
        println("Digite sua nota: ")
        val nota1 = readln()
        println("Digite sua nota: ")
        val nota2 = readln()
        val media = (nota1.toDouble() + nota2.toDouble())/2
        println("Sua média é: $media")
        if (media >= 7) {
            println("Bom aproveitamento")
        }else{
            println("Mal aproveitamento")
        }
    }
}

fun main(){
    ex19().aprovado()
}