class ex25 {
    fun trinagulo()
    {
        print("Digite o primeiro segmento de reta: ")
        val a = readln().toDoubleOrNull()

        print("Digite o segundo segmento de reta: ")
        val b = readln().toDoubleOrNull()

        print("Digite o terceiro segmento de reta: ")
        val c = readln().toDoubleOrNull()

        if (a == null || b == null || c == null || a <= 0 || b <= 0 || c <= 0) {
            println("Entrada inválida! Certifique-se de inserir valores positivos.")
            return
        }

        if (a < b + c && b < a + c && c < a + b) {
            println("Os segmentos podem formar um triângulo.")
        } else {
            println("Os segmentos NÃO podem formar um triângulo.")
        }
    }
}

fun main(){
    ex25().trinagulo()
}