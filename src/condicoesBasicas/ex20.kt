class ex20 {
    fun parImpar(){
        println("Digite um número inteiro: ")
        val num = readln()
        if (num.toInt() % 2 == 0){
            println("O número $num é par")
        }else{
            println("O número $num é ímpar")
        }
    }
}

fun main(){
    ex20().parImpar()
}