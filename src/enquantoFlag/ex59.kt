package enquantoFlag

class ex59 {
    fun cadastroPessoas() {
        var maiorIdade = 0
        var quantidadeHomens = 0
        var idadeMulherMaisJovem = Int.MAX_VALUE
        var somaIdadeHomens = 0
        var quantidadeHomensCadastrados = 0
        var continuar = true

        while (continuar) {
            println("Digite o sexo da pessoa (M/F): ")
            val sexo = readln().uppercase()

            println("Digite a idade da pessoa: ")
            val idade = readln().toIntOrNull()

            if (idade == null || idade <= 0) {
                println("Idade inválida! Por favor, digite uma idade positiva.")
                continue
            }

            if (idade > maiorIdade) {
                maiorIdade = idade
            }

            if (sexo == "M") {
                quantidadeHomens++
                somaIdadeHomens += idade
                quantidadeHomensCadastrados++
            }

            if (sexo == "F" && idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade
            }

            println("Deseja continuar cadastrando? (S/N): ")
            val resposta = readln().uppercase()

            if (resposta != "S") {
                continuar = false
            }
        }

        println("Maior idade registrada: $maiorIdade")
        println("Quantidade de homens cadastrados: $quantidadeHomens")

        if (idadeMulherMaisJovem != Int.MAX_VALUE) {
            println("Idade da mulher mais jovem: $idadeMulherMaisJovem")
        } else {
            println("Nenhuma mulher foi cadastrada.")
        }

        if (quantidadeHomensCadastrados > 0) {
            val mediaIdadeHomens = somaIdadeHomens.toDouble() / quantidadeHomensCadastrados
            println("Média de idade entre os homens: ${"%.2f".format(mediaIdadeHomens)}")
        } else {
            println("Nenhum homem foi cadastrado.")
        }
    }
}

fun main() {
    ex59().cadastroPessoas()
}
