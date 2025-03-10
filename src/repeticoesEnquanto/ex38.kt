package repeticoesEnquanto

class ex38 {
    fun contagem (){
        var num = 6
        while (num <= 11) {
            print("$num ")
            num++
        }
        println("Acabou!")
    }
}

fun main (){
    ex38().contagem()
}