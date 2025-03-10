package condicoesCompostas
import kotlin.random.Random

class ex31 {
    fun jokenpo(){
        val opcoes = listOf("Pedra", "Papel", "Tesoura")

        println("Bem-vindo ao Jokenpô!")
        println("Escolha uma opção:")
        println("[1] Pedra")
        println("[2] Papel")
        println("[3] Tesoura")

        print("Digite o número correspondente à sua escolha: ")
        val escolhaUsuario = readln().toIntOrNull()

        if (escolhaUsuario == null || escolhaUsuario !in 1..3) {
            println("Escolha inválida! Tente novamente com um número entre 1 e 3.")
            return
        }

        val escolhaComputador = Random.nextInt(1, 4)
        val jogador = opcoes[escolhaUsuario - 1]
        val computador = opcoes[escolhaComputador - 1]

        println("\nVocê escolheu: $jogador")
        println("O computador escolheu: $computador")

        when {
            jogador == computador -> println("Empate!")
            (jogador == "Pedra" && computador == "Tesoura") ||
                    (jogador == "Papel" && computador == "Pedra") ||
                    (jogador == "Tesoura" && computador == "Papel") -> println("Você venceu!")
            else -> println("O computador venceu!")
        }
    }
}

fun main(){
    ex31().jokenpo()
}
