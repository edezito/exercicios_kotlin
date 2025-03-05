class calculo (){
    fun calculoDelta(){
        println("Digite 3 valores para descobrir o delta")
        val valorA = readln()
        val valorB = readln()
        val valorC = readln()
        val delta = (valorB.toInt()*valorB.toDouble())-(4 * valorA.toDouble() * valorC.toDouble())
        print("O delta desses valores é $delta")
    }
}

fun main(){
    calculo().calculoDelta()
}