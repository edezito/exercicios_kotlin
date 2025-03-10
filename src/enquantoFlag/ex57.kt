package enquantoFlag

class ex57 {
    fun salario(){
        var totalSalarioHomens = 0.0
        var totalSalarioMulheres = 0.0
        var continuar = true

        while(continuar){
            println("Qual é seu salário? ")
            val salario = readln()
            println("Qual o seu sexo [M/F]: ")
            val sexo = readln().trim().uppercase()

            when (sexo) {
                "M" -> totalSalarioHomens += salario.toDouble()
                "F" -> totalSalarioMulheres += salario.toDouble()
                else -> {
                    println("⚠️ Sexo inválido! Digite 'M' para masculino ou 'F' para feminino.")
                    continue
                }
            }

            print("Deseja continuar? (S/N): ")
            val resposta = readln().trim().uppercase()
            if (resposta == "N") {
                continuar = false
            }
        }
    }
}

fun main(){
    ex57().salario()
}