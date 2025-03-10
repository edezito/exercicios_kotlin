package condicoesCompostas

class ex30 {
    fun triangulo(){
        print("Digite o primeiro segmento de reta: ")
        val a = readln().toDoubleOrNull()

        print("Digite o segundo segmento de reta: ")
        val b = readln().toDoubleOrNull()

        print("Digite o terceiro segmento de reta: ")
        val c = readln().toDoubleOrNull()

        if (a == null || b == null || c == null || a <= 0 || b <= 0 || c <= 0){
            println("Os segmentos podem formar um triângulo.")

            when {
                a == b && b == c -> println("Tipo: Triângulo EQUILÁTERO (todos os lados iguais).")
                a == b || a == c || b == c -> println("Tipo: Triângulo ISÓSCELES (dois lados iguais).")
                else -> println("Tipo: Triângulo ESCALENO (todos os lados diferentes).")
            }
        } else {
            println("Os segmentos NÃO podem formar um triângulo.")
        }
    }
}

fun main(){
    ex30().triangulo()
}