class numeros(){
    fun numerosNatural(){
        println("Digite um número natural: ")
        val nat = readln()
        val dobro = nat.toDouble() * 2
        val terc = nat.toDouble() / 3
        println("O dobro de $nat é $dobro e a sua terça parte é $terc")
    }
}