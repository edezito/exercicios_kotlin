package repeticoesEnquanto

class ex45 {
    fun contagem() {
        print("Digite o primeiro valor: ")
        val inicio = readln().toInt()

        print("Digite o último valor: ")
        val fim = readln().toInt()

        print("Digite o incremento: ")
        val incremento = readln().toInt()

        println("Contagem:")
        var num = inicio


        if (inicio < fim) {
            while (num <= fim) {
                print("$num ")
                num += incremento
            }
        } else {
            while (num >= fim) {
                print("$num ")
                num -= incremento
            }
        }

        println("Acabou!")
    }
}

fun main() {
    ex45().contagem()
}