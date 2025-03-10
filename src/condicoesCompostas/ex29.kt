package condicoesCompostas

class ex29 {
    fun funcionario(){
        println("Digite seu nome")
        val nome = readln()
        println("Digite seu salário")
        val salario = readln()
        println("Quantos anos você trabalha na empresa?")
        val anosTrabalhando = readln()

        if (anosTrabalhando.toInt() >= 10){
            val novoSalario10 = salario.toInt() + (salario.toInt() * 0.2)
            println("$nome seu novo salário é de: $novoSalario10")
        } else if (anosTrabalhando.toInt() >= 3){
            val novoSalario10 = salario.toInt() + (salario.toInt() * 0.125)
            println("$nome seu novo salário é de: $novoSalario10")
        }else{
            val novoSalario10 = salario.toInt() + (salario.toInt() * 0.03)
            println("$nome seu novo salário é de: $novoSalario10")
        }
    }
}

fun main(){
    ex29().funcionario()
}