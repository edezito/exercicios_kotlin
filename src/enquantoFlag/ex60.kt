package enquantoFlag

class ex60 {
    fun cadastroPessoas() {
        var nomeMaisVelho = ""
        var idadeMaisVelho = 0
        var nomeMulherMaisJovem = ""
        var idadeMulherMaisJovem = Int.MAX_VALUE
        var somaIdade = 0
        var quantidadePessoas = 0
        var quantidadeHomensMais30 = 0
        var quantidadeMulheresMenos18 = 0
        var continuar = true

        while (continuar) {
            println("Digite o nome da pessoa: ")
            val nome = readln()

            println("Digite a idade da pessoa: ")
            val idade = readln().toIntOrNull()

            if (idade == null || idade <= 0) {
                println("Idade inválida! Por favor, digite uma idade positiva.")
                continue
            }

            println("Digite o sexo da pessoa (M/F): ")
            val sexo = readln().uppercase()

            if (sexo != "M" && sexo != "F") {
                println("Sexo inválido! Por favor, digite M para masculino ou F para feminino.")
                continue
            }

            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade
                nomeMaisVelho = nome
            }

            if (sexo == "F" && idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade
                nomeMulherMaisJovem = nome
            }

            somaIdade += idade
            quantidadePessoas++

            if (sexo == "M" && idade > 30) {
                quantidadeHomensMais30++
            }

            if (sexo == "F" && idade < 18) {
                quantidadeMulheresMenos18++
            }

            println("Deseja continuar cadastrando? (S/N): ")
            val resposta = readln().uppercase()

            if (resposta != "S") {
                continuar = false
            }
        }

        if (nomeMaisVelho.isNotEmpty()) {
            println("Nome da pessoa mais velha: $nomeMaisVelho com $idadeMaisVelho anos.")
        } else {
            println("Nenhuma pessoa foi cadastrada.")
        }

        if (nomeMulherMaisJovem.isNotEmpty()) {
            println("Nome da mulher mais jovem: $nomeMulherMaisJovem com $idadeMulherMaisJovem anos.")
        } else {
            println("Nenhuma mulher foi cadastrada.")
        }

        if (quantidadePessoas > 0) {
            val mediaIdade = somaIdade.toDouble() / quantidadePessoas
            println("Média de idade do grupo: ${"%.2f".format(mediaIdade)}")
        } else {
            println("Nenhuma pessoa foi cadastrada.")
        }

        println("Quantos homens têm mais de 30 anos: $quantidadeHomensMais30")
        println("Quantas mulheres têm menos de 18 anos: $quantidadeMulheresMenos18")
    }
}

fun main() {
    ex60().cadastroPessoas()
}