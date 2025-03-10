package condicoesCompostas
import kotlin.random.Random

class ex32 {
    fun sorte (){
        val numeroSorteado = Random.nextInt(1, 6)

        println("Tente adivinhar o número que o computador sorteou (entre 1 e 5).")
        print("Digite seu palpite: ")

        val palpite = readln().toIntOrNull()

        if (palpite == null || palpite !in 1..5) {
            println("Palpite inválido! Digite um número entre 1 e 5.")
            return
        }

        if (palpite == numeroSorteado) {
            println("Parabéns! Você acertou! O número sorteado foi $numeroSorteado.")
        } else {
            println("Que pena! Você errou. O número sorteado foi $numeroSorteado.")
        }
    }
}

fun main (){
    ex32().sorte()
}