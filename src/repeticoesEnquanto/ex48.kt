package repeticoesEnquanto

class Ex48 {
    fun somatorio() {
        var soma = 0
        var contador = 1

        while (contador <= 7) {
            print("Digite o $contador° número: ")
            val numero = readln().toIntOrNull() ?: 0
            soma += numero
            contador++
        }

        println("A soma dos 7 números digitados é: $soma")
    }
}

fun main() {
    Ex48().somatorio()
}