class ex26 {
    fun compararNum (){
        println("Digite dois número inteiros")
        val num1 = readln()
        val num2 = readln()

        if (num1.toInt() > num2.toInt()){
            println("O primeiro número é maior")
        } else if (num1.toInt() < num2.toInt()){
            println("O segundo número é maior")
        }
        else{
            println("Não existe valor maior, os dois são iguais")
        }

    }

    fun compararNumWhen(){
        println("Digite dois número inteiros")
        val num1 = readln()
        val num2 = readln()

        when {
            num1 > num2 -> println("O primeiro número é maior.")
            num1 < num2 -> println("O segundo número é maior.")
            else -> println("Não existe valor maior, os dois são iguais.")
        }
    }
}
fun main(){
    ex26().compararNumWhen()
}