class preco (){
    fun precoPromocional(){
        println("Digite o preço do produto: ")
        val preco = readln()
        val desconto = preco.toDouble() - (preco.toDouble() * 0.05)
        println("O preço promocional é $desconto")
    }
}