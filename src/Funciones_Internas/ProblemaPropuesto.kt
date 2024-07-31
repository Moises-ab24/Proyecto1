package Funciones_Internas

/*
Confeccionar una función que permita cargar dos enteros y nos muestre el
mayor de ellos. Realizar esta actividad con 5 pares de valores.
Implementar una función interna que retorne el mayor de dos enteros.
 */

fun mostrarMayorDePares() {
    fun mayor(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    for (i in 1..5) {
        println("Par de valores $i:")

        print("Ingrese el primer valor: ")
        val valor1 = readln().toInt()

        print("Ingrese el segundo valor: ")
        val valor2 = readln().toInt()

        val maximo = mayor(valor1, valor2)
        println("El mayor valor entre $valor1 y $valor2 es: $maximo")
    }
}

fun main() {
    mostrarMayorDePares()
}