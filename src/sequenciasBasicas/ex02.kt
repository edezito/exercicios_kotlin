class seuNome (){
    fun nome(){
        println("Qual é o seu nome? ")
        val nome = readln()
        println("Olá $nome seja bem vindo!")
    }
}

fun main(){
    seuNome().nome()
}