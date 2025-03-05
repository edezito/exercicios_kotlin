class carteira (){
    fun carteiraReais(){
        println("Quanto você tem em Reais? ")
        val carteira = readln()
        val dol = carteira.toDouble() / 3.45
        println("Você tem $dol em Doláres")
    }
}

fun main(){
    carteira().carteiraReais()
}