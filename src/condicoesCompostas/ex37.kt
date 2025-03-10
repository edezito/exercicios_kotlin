package condicoesCompostas

class ex37 {
    fun reajusteSalarial(){
        print("Digite o salário atual do funcionário: R$ ")
        val salario = readln().toDoubleOrNull()

        print("Digite o gênero do funcionário (M/F): ")
        val genero = readln().uppercase()

        print("Digite o tempo de empresa (em anos): ")
        val anos = readln().toIntOrNull()

        if (salario == null || salario <= 0 || anos == null || anos < 0 || (genero != "M" && genero != "F")) {
            println("Dados inválidos! Verifique as informações digitadas.")
            return
        }

        val percentual = when {
            genero == "F" && anos < 15 -> 0.05
            genero == "F" && anos in 15..20 -> 0.12
            genero == "F" && anos > 20 -> 0.23
            genero == "M" && anos < 20 -> 0.03
            genero == "M" && anos in 20..30 -> 0.13
            genero == "M" && anos > 30 -> 0.25
            else -> 0.0
        }

        val aumento = salario * percentual
        val novoSalario = salario + aumento

        println("\nReajuste aplicado: ${percentual * 100}%")
        println("Aumento no salário: R$ %.2f".format(aumento))
        println("Novo salário: R$ %.2f".format(novoSalario))
    }
}

fun main(){
    ex37().reajusteSalarial()
}