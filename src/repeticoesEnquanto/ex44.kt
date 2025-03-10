package repeticoesEnquanto

class ex44 {
    fun contagem() {
        print("Digite o primeiro valor: ")
        val inicio = readln().toInt()

        print("Digite o último valor: ")
        val fim = readln().toInt()

        print("Digite o incremento: ")
        val incremento = readln().toInt()

        println("Contagem:")
        var num = inicio

        while (num <= fim) {
            print("$num ")
            num += incremento
        }

        println("Acabou!")
    }
}

fun main() {
    ex44().contagem()
}