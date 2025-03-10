package repeticoesEnquanto

class ex52 {
    fun maiorIdade(){
        var i = 0
        var somaIdades = 0
        var maioresDe18 = 0
        var menoresDe5 = 0
        var maiorIdade = Int.MIN_VALUE

        while (i < 10) {
            print("Digite a idade da pessoa ${i + 1}: ")
            val idade = readln().toInt()
            somaIdades += idade

            if (idade > 18) maioresDe18++
            if (idade < 5) menoresDe5++
            if (idade > maiorIdade) maiorIdade = idade

            i++
        }

        val mediaIdade = somaIdades / 10.0

        println("Média de idade do grupo: ${"%.2f".format(mediaIdade)} anos")
        println("Quantidade de pessoas com mais de 18 anos: $maioresDe18")
        println("Quantidade de pessoas com menos de 5 anos: $menoresDe5")
        println("Maior idade digitada: $maiorIdade anos")
    }
}

fun main(){
    ex52().maiorIdade()
}