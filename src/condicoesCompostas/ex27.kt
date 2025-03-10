package condicoesCompostas

class ex27 {
    fun notas(){
        println("Digite duas notas: ")
        val nota1 = readln()
        val nota2 = readln()
        val media = (nota1.toDouble() + nota2.toDouble())/2
        println("Media: $media")

        when{
            media >= 7 -> println("Aprovado")
            media >= 5 -> println("Recuperação")
            else -> println("Reprovado")

        }
    }
}
fun main(){
    ex27().notas()
}