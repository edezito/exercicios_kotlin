package repeticoesEnquanto

class ex43 {
    fun contagemRegressiva() {
        var num = 30
        while (num >= 1) {
            if (num % 4 == 0) {
                print("[$num] ")
            } else {
                print("$num ")
            }
            num --
        }
        println("Acabou!")
    }
}

fun main() {
    ex43().contagemRegressiva()
}