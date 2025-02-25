class numeros(){
    fun antSucessor(){
        println("Digite um número: ")
        val n = readln()
        val suc = n.toInt()+1
        val ant = n.toInt()-1
        println("O sucessor de $n é $suc e, o antecessor é $ant")
    }
}