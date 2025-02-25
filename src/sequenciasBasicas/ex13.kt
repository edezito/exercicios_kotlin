class Salario (){
    fun aumentoSalario(){
        println("Digite o seu sálario: ")
        val salari = readln()
        val aumento = salari.toDouble() + (salari.toDouble() * 0.15)
        println("Seu salário com o aumento é $aumento")
    }
}