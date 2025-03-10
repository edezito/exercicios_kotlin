package repeticoesEnquanto

class ex51 {
    fun precoProduto(){
        var i = 0
        var maiorPreco = Double.MIN_VALUE
        var menorPreco = Double.MAX_VALUE

        while (i < 8) {
            print("Digite o preço do produto ${i + 1}: ")
            val preco = readln().toDouble()

            if (preco > maiorPreco) maiorPreco = preco
            if (preco < menorPreco) menorPreco = preco

            i++
        }

        println("Maior preço digitado: R$ $maiorPreco")
        println("Menor preço digitado: R$ $menorPreco")
    }
}

fun main (){
    ex51().precoProduto()
}