class ex23 {
    fun promocao(){
        println(
            """Escolha seu sexo: 
            |[1] - Homem
            |[2] - Mulher
        """.trimMargin()
        )
        val sexo = readln()
        println("Valor do produto: ")
        val produto = readln()
        if (sexo.toInt() == 1){
            val produtoDesconto = produto.toDouble() - (produto.toDouble() * 0.05)
            println("O valor da compra com o desconto de 5% é $produtoDesconto R$")
        }
        if (sexo.toInt() == 2){
            val produtoDesconto = produto.toDouble() - (produto.toDouble() * 0.13)
            println("O valor da compra com o desconto de 13% é $produtoDesconto R$")
        }
    }
}

fun main (){
    ex23().promocao()
}