package repeticoesEnquanto

class ex53 {
    fun homensMulheres(){
        var i = 0
        var homens = 0
        var mulheres = 0
        var somaIdades = 0
        var somaIdadesHomens = 0
        var idadeHomens = 0
        var mulheresAcima20 = 0

        while (i < 5) {
            print("Digite a idade da pessoa ${i + 1}: ")
            val idade = readln().toInt()
            print("Digite o sexo da pessoa ${i + 1} (M/F): ")
            val sexo = readln().uppercase()

            somaIdades += idade

            if (sexo == "M") {
                homens++
                somaIdadesHomens += idade
                idadeHomens++
            } else if (sexo == "F") {
                mulheres++
                if (idade > 20) mulheresAcima20++
            }

            i++
        }

        val mediaGeral = somaIdades / 5.0
        val mediaIdadeHomens = if (idadeHomens > 0) somaIdadesHomens / idadeHomens.toDouble() else 0.0

        println("Quantidade de homens cadastrados: $homens")
        println("Quantidade de mulheres cadastradas: $mulheres")
        println("Média de idade do grupo: ${"%.2f".format(mediaGeral)} anos")
        println("Média de idade dos homens: ${"%.2f".format(mediaIdadeHomens)} anos")
        println("Quantidade de mulheres com mais de 20 anos: $mulheresAcima20")
    }
}

fun main(){
    ex53().homensMulheres()
}