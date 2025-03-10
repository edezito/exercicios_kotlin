package condicoesCompostas

class ex35 {
    fun carro(){
        print("Digite o tipo de carro (popular ou luxo): ")
        val tipoCarro = readln().lowercase()

        print("Quantos dias de aluguel? ")
        val dias = readln().toIntOrNull()

        print("Quantos Km foram percorridos? ")
        val kmRodados = readln().toDoubleOrNull()

        if (dias == null || kmRodados == null || dias <= 0 || kmRodados < 0) {
            println("Valores inválidos! Insira números positivos.")
            return
        }

        val precoTotal = when (tipoCarro) {
            "popular" -> {
                val precoDia = 90.0
                val precoKm = if (kmRodados <= 100) kmRodados * 0.20 else kmRodados * 0.10
                (dias * precoDia) + precoKm
            }
            "luxo" -> {
                val precoDia = 150.0
                val precoKm = if (kmRodados <= 200) kmRodados * 0.30 else kmRodados * 0.25
                (dias * precoDia) + precoKm
            }
            else -> {
                println("Tipo de carro inválido! Escolha 'popular' ou 'luxo'.")
                return
            }
        }

        println("\nO valor total a pagar pelo aluguel é: R$%.2f".format(precoTotal))
    }
}

fun main(){
    ex35().carro()
}