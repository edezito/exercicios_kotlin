class ex22 {
    fun alistamento(){
        println("Digite seu ano de nascimento: ")
        val ano = readln()
        val idade = 2025 - ano.toInt()
        if (idade.toInt() < 18){
            val faltam = 18 - idade.toInt()
            println("Você tem $idade anos. Faltam $faltam anos para o alistamento ")
        }else{
            val passou = idade.toInt() - 18
            println("Faz $passou que você se alistou")
        }
    }
}
fun main(){
    ex22().alistamento()
}