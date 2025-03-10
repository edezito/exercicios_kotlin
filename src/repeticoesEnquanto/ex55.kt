package repeticoesEnquanto
import kotlin.random.Random

class ex55 {
    fun jogo(){
        val numeroSorteado = Random.nextInt(1, 11)
        var tentativas = 4

        println("O computador sorteou um número entre 1 e 10.")
        println("Você tem $tentativas tentativas para adivinhar.")

        while (tentativas > 0) {
            print("Digite seu palpite: ")
            val palpite = readln().toIntOrNull()

            if (palpite == null || palpite !in 1..10) {
                println("Palpite inválido! Digite um número entre 1 e 10.")
                continue
            }

            if (palpite == numeroSorteado) {
                println("🎉 Parabéns! Você acertou! O número sorteado foi $numeroSorteado.")
                return
            } else {
                tentativas--
                val dica = if (palpite < numeroSorteado) "maior" else "menor"

                if (tentativas > 0) {
                    println("❌ Errado! O número é $dica que $palpite. Tentativas restantes: $tentativas.")
                } else {
                    println("💀 Fim de jogo! O número correto era $numeroSorteado.")
                }
            }
        }
    }
}

fun main(){
    ex55().jogo()
}