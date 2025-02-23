class exercicios() {

    fun sequencias_basicas (){
        println("Olá Mundo!")

        println("Qual é o seu nome? ")
        val nome = readln()
        println("Olá $nome seja bem vindo!")

        println("Digite seu nome: ")
        val funcionario = readln()
        println("Digite o seu salário: ")
        val salario = readln()
        println("Prezado $funcionario tem um sálario de R$ $salario em Junho.")

        println("Digite dois números inteiros: ")
        val num1 = readln()
        val num2 = readln()
        val sum = num1.toInt() + num2.toInt()
        println("A soma de $num1 e $num2 é igual a $sum.")

        println("Digite suas notas: ")
        val nota1 = readln()
        val nota2 = readln()
        val med = (nota1.toDouble() + nota2.toDouble())/2
        println("A média entre $nota1 e $nota2 é igual a $med")

        println("Digite um número: ")
        val n = readln()
        val suc = n.toInt()+1
        val ant = n.toInt()-1
        println("O sucessor de $n é $suc e, o antecessor é $ant")

        println("Digite um número natural: ")
        val nat = readln()
        val dobro = nat.toDouble() * 2
        val terc = nat.toDouble() / 3
        println("O dobro de $nat é $dobro e a sua terça parte é $terc")

        println("Digite uma distância em metros")
        val dis = readln()
        val km = dis.toDouble() / 1000
        val hm = dis.toDouble() / 100
        val dam = dis.toDouble() / 10
        val dm = dis.toDouble() * 10
        val cm = dis.toDouble() * 100
        val mm = dis.toDouble() * 1000
        println("Convertendo $dis M" +
                "$km km" +
                "$hm hm" +
                "$dam dam" +
                "$dm dm" +
                "$cm cm" +
                "$mm mm")

        println("Quanto você tem em Reais? ")
        val carteira = readln()
        val dol = carteira.toDouble() / 3.45
        println("Você tem $dol em Doláres")

        println("Largura")
        val larg = readln()
        println("Altura")
        val alt = readln()
        val area = larg.toDouble() * alt.toDouble()
        val tinta = area.toDouble() / 2
        println("Sua parede tem $area m² e precisa de $tinta litros de tinta para pintar")

        println("Digite 3 valores para descobrir o delta")
        val valorA = readln()
        val valorB = readln()
        val valorC = readln()
        val delta = (valorB.toInt()*valorB.toDouble())-(4 * valorA.toDouble() * valorC.toDouble())
        print("O delta desses valores é $delta")

        println("Digite o preço do produto: ")
        val preco = readln()
        val desconto = preco.toDouble() - (preco.toDouble() * 0.05)
        println("O preço promocional é $desconto")

        println("Digite o seu sálario: ")
        val salari = readln()
        val aumento = salari.toDouble() + (salari.toDouble() * 0.15)
        println("Seu salário com o aumento é $aumento")

        println("Quantos km você rodou com o carro? ")
        val km_rodados = readln()
        println("Quantos dias você ficou com o carro? ")
        val dias = readln()
        val preco_rodagem = (km_rodados.toDouble() * 0.20) + (dias.toDouble() * 90)
        println("Crédito em aberto com a locadora: $preco_rodagem R$")

        println("Dias trabalhados: ")
        val dias_trabalhados = readln()
        val dia_preco = 8 * 25
        val pagamento = dia_preco * dias_trabalhados.toInt()
        println("Sálario: $pagamento R$")

        println("Quantos cigarros você fuma por dia? ")
        val cigarrosPorDia = readln().toInt()
        println("Há quantos anos você fuma? ")
        val anosFumando = readln().toInt()

        val diasFumando = anosFumando * 365
        val totalCigarros = cigarrosPorDia * diasFumando
        val minutosPerdidos = totalCigarros * 10
        val horasPerdidas = minutosPerdidos / 60
        val diasPerdidos = horasPerdidas / 24

        println("Você perdeu aproximadamente $diasPerdidos dias de vida devido ao tabagismo.")
    }

}
