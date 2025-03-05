class ex21 {
    fun anoBissexto() {
        println("Digite um ano: ")
        val ano = readln()
        if ((ano.toInt() % 4 == 0 && ano.toInt() % 100 != 0) || (ano.toInt() % 400 == 0)) {
            println("$ano é um ano bissexto.")
        } else {
            println("$ano não é um ano bissexto.")
        }
    }
}

fun main (){
    ex21().anoBissexto()
}