package enquantoFlag

class ex58 {
    fun idadeAlunos(){
        var totalIdades = 0
        var quantidadeAlunos = 0
        var continuar = true

        while(continuar){
            println("Digite a idade dos alunos (ou 999 para finalizar: ")
            val idade = readln()


            if (idade.toInt() == 999){
                continuar = false
            }else{
                totalIdades+=idade.toInt()
                quantidadeAlunos++
            }
        }

        if (quantidadeAlunos > 0) {
            val mediaIdade = totalIdades.toDouble() / quantidadeAlunos
            println("Existem $quantidadeAlunos alunos na turma.")
            println("A média de idade da turma é: ${"%.2f".format(mediaIdade)} anos.")
        } else {
            println("Nenhum aluno foi cadastrado.")
        }
    }
}

fun main(){
    ex58().idadeAlunos()
}