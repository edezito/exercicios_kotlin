class area(){
    fun medirArea(){
        println("Largura")
        val larg = readln()
        println("Altura")
        val alt = readln()
        val area = larg.toDouble() * alt.toDouble()
        val tinta = area.toDouble() / 2
        println("Sua parede tem $area m² e precisa de $tinta litros de tinta para pintar")
    }
}

fun main(){
    area().medirArea()
}