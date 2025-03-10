package repeticoesEnquanto

class ex42 {
    fun contagem(){
        println("Digite um número: ")
        var num = readln().toInt()

        while (num >= 0){
            println("$num ")
            num -= 1
        }
        println("Acabou!")
    }
}

fun main(){
    ex42().contagem()
}