package condicoesCompostas

class ex28 {
    fun terreno() {
        println("Digite a largura de seu terreno: ")
        val largura = readln()
        println("Digite o comprimento de seu terreno: ")
        val comprimento = readln()
        val area = largura.toDouble() * comprimento.toDouble()

        when {
            area >= 500 -> println("Terreno VIP")
            area >= 100 -> println("Terreno MASTER")
            else -> println("Terreno POPULAR")
        }
    }
}

fun main(){
    ex28().terreno()
}