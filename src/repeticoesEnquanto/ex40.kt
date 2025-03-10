package repeticoesEnquanto

class ex40 {
    fun contagem (){
        var num = 0
        while (num <= 18) {
            print("$num ")
            num += 3
        }
        println("Acabou!")
    }
}
fun main(){
    ex40().contagem()
}