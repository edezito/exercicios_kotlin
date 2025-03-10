package repeticoesEnquanto

class Ex49 {
    fun contarParesImpares() {
        var pares = 0
        var impares = 0
        var contador = 1

        while (contador <= 6) {
            print("Digite o $contador° número: ")
            val numero = readln().toIntOrNull() ?: 0

            if (numero % 2 == 0) {
                pares++
            } else {
                impares++
            }

            contador++
        }

        println("Quantidade de números pares: $pares")
        println("Quantidade de números ímpares: $impares")
    }
}

fun main() {
    Ex49().contarParesImpares()
}