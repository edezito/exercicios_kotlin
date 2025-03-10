package repeticoesEnquanto

class ex47 {
    fun calcularSoma() {
        var soma = 0
        var num = 500

        while (num >= 0) {
            soma += num
            num -= 50
        }

        println("A soma dos números de 500 a 0, diminuindo de 50 em 50, é: $soma")
    }
}

fun main() {
    ex47().calcularSoma()
}