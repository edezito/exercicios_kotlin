package condicoesCompostas

class ex36 {
    fun atividFisica(){
        print("Quantas horas de atividade física você fez neste mês? ")
        val horas = readln().toIntOrNull()

        if (horas == null || horas < 0) {
            println("Valor inválido! Digite um número positivo.")
            return
        }

        val pontos = when {
            horas <= 10 -> horas * 2
            horas <= 20 -> (10 * 2) + ((horas - 10) * 5)
            else -> (10 * 2) + (10 * 5) + ((horas - 20) * 10)
        }

        val dinheiro = pontos * 0.05

        println("\nVocê acumulou $pontos pontos neste mês.")
        println("O valor que você receberá é: R$%.2f".format(dinheiro))
    }
}

fun main(){
    ex36().atividFisica()
}