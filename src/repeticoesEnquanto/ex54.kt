package repeticoesEnquanto

class ex54 {
    fun peso(){
        var i = 0
        var somaAlturas = 0.0
        var mais90kg = 0
        var menos50kgMenos160cm = 0
        var mais190cmMais100kg = 0

        while (i < 7) {
            print("Digite o peso da pessoa ${i + 1} (kg): ")
            val peso = readln().toDouble()
            print("Digite a altura da pessoa ${i + 1} (m): ")
            val altura = readln().toDouble()

            somaAlturas += altura

            if (peso > 90) mais90kg++
            if (peso < 50 && altura < 1.60) menos50kgMenos160cm++
            if (altura > 1.90 && peso > 100) mais190cmMais100kg++

            i++
        }

        val mediaAltura = somaAlturas / 7

        println("Média de altura do grupo: ${"%.2f".format(mediaAltura)} m")
        println("Quantidade de pessoas com mais de 90 kg: $mais90kg")
        println("Quantidade de pessoas com menos de 50 kg e menos de 1.60 m: $menos50kgMenos160cm")
        println("Quantidade de pessoas com mais de 1.90 m e mais de 100 kg: $mais190cmMais100kg")
    }
}

fun main(){
    ex54().peso()
}