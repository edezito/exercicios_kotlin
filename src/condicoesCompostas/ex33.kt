package condicoesCompostas

class ex33 {
    fun emprestimo (){
        println("Valor da casa: ")
        val valorCasa = readln()
        println("Salário do comprador: ")
        val valorSalario = readln()
        val porcentagemSalario = valorSalario.toDouble() - (valorSalario.toDouble() * 0.30)
        println("Quantos anos você vai pagar: ")
        val anosPaganado = readln()

        val prestacaoMensal = valorCasa.toDouble() / (anosPaganado.toDouble()*12)

        if (prestacaoMensal < porcentagemSalario){
            println("Emprestimo aprovado. Valor mensal: $prestacaoMensal")
        } else{
            println("Empréstimo negado. Valor mensal: $prestacaoMensal")
        }
    }
}

fun main(){
    ex33().emprestimo()
}