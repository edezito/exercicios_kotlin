class numerosInteiros(){
    fun numeros(){
        println("Digite dois números inteiros: ")
        val num1 = readln()
        val num2 = readln()
        val sum = num1.toInt() + num2.toInt()
        println("A soma de $num1 e $num2 é igual a $sum.")
    }
}

fun main (){
    numerosInteiros().numeros()
}