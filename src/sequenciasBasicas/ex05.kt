class notas(){
    fun notasAlunos(){
        println("Digite suas notas: ")
        val nota1 = readln()
        val nota2 = readln()
        val med = (nota1.toDouble() + nota2.toDouble())/2
        println("A média entre $nota1 e $nota2 é igual a $med")
    }
}