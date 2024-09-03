package POO_Colaboración_Clases

/*
Plantear un programa que permita jugar a los dados. Las reglas de juego son:
se tiran tres dados si los tres salen con el mismo valor mostrar un mensaje que
"gano", sino "perdió".
Podemos identificar la clase Dado y la clase JuegoDeDados.
 */

class Dado (var valor: Int){

    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
        imprimir()
    }

    fun imprimir() {
        println("Valor del dado: $valor")
    }
}

class JuegoDeDados {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)

    fun jugar() {
        var resultado = false
        var cant = 0
        while(resultado != true) {
            dado1.tirar()
            dado2.tirar()
            dado3.tirar()
            if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
                resultado = true
            else
                resultado = false
            cant = cant + 1
        }
        println("El jugador ha ganado")
        println("Cantidad de veces jugadas: $cant")
    }
}

fun main() {
    val juego1 = JuegoDeDados()
    juego1.jugar()
}