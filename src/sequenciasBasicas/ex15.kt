class salario(){
    fun diasTrabalhado(){
        println("Dias trabalhados: ")
        val dias_trabalhados = readln()
        val dia_preco = 8 * 25
        val pagamento = dia_preco * dias_trabalhados.toInt()
        println("Sálario: $pagamento R$")
    }
}