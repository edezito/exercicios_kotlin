package repeticoesEnquanto

class ex41 {
    fun contagem (){
        var num = 100
        while (num >= 0) {
            print("$num ")
            num -=5
        }
        println("Acabou!")
    }
}
fun main(){
    ex41().contagem()
}