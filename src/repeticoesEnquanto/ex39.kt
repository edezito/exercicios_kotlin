package repeticoesEnquanto

class ex39 {
    fun contagem (){
        var num = 11
        while (num >= 3) {
            print("$num ")
            num--
        }
        println("Acabou!")
    }
}

fun main(){
    ex39().contagem()
}