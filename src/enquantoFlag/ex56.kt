package enquantoFlag

class ex56 {
    fun soma(){
        var soma = 0
        var continuar = true  // Flag de controle

        println("Digite números para somar (Digite 1111 para sair):")

        while (continuar) {
            print("Número: ")
            val numero = readln().toIntOrNull()

            if (numero == null) {
                println("⚠️ Entrada inválida! Digite um número inteiro.")
                continue
            }

            if (numero == 1111) {
                continuar = false  // Altera a flag para encerrar o loop
            } else {
                soma += numero
            }
        }

        println("🔢 Somatório final: $soma")
    }
}
fun main(){
    ex56().soma()
}