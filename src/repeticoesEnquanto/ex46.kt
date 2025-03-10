package repeticoesEnquanto

class ex46 {
    fun calcularSoma() {
        var soma = 0
        var num = 6

        while (num <= 100) {
            soma += num
            num += 2
        }

        println("A soma dos números pares de 6 a 100 é: $soma")
    }
}

fun main() {
    ex46().calcularSoma()
}