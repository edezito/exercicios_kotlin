package condicoesCompostas

class ex34 {
    fun imc(){
        print("Digite seu peso (kg): ")
        val peso = readln()

        print("Digite sua altura (m): ")
        val altura = readln()

        val imc = peso.toDouble() / (altura.toDouble() * altura.toDouble())

        println("\nSeu IMC é: %.2f".format(imc))

        val classificacao = when {
            imc < 18.5 -> "Abaixo do peso"
            imc in 18.5..24.9 -> "Peso ideal"
            imc in 25.0..29.9 -> "Sobrepeso"
            imc in 30.0..39.9 -> "Obesidade"
            else -> "Obesidade mórbida"
        }

        println("Classificação: $classificacao")
    }
}
fun main(){
    ex34().imc()
}