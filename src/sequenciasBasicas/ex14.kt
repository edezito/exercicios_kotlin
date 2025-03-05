class aluguel(){
    fun aluguelCarro(){
        println("Quantos km você rodou com o carro? ")
        val km_rodados = readln()
        println("Quantos dias você ficou com o carro? ")
        val dias = readln()
        val preco_rodagem = (km_rodados.toDouble() * 0.20) + (dias.toDouble() * 90)
        println("Crédito em aberto com a locadora: $preco_rodagem R$")
    }
}

fun main(){
    aluguel().aluguelCarro()
}