package Modificadores_Private_Public

/*
Plantear una clase Operaciones que en un método solicite la carga de 2 enteros y
posteriormente llame desde el mismo método a otros dos métodos privados que
calculen su suma y producto.
 */

class Operaciones {
    private var valor1: Int = 0
    private var valor2: Int = 0
    fun cargar() {
        print("Ingrese primer valor:")
        valor1 = readln().toInt()
        print("Ingrese segundo valor:")
        valor2 = readln().toInt()
        sumar()
        restar()
    }
    private fun sumar() {
        val suma = valor1 + valor2
        println("La suma de $valor1 y $valor2 es $suma")
    }
    private fun restar() {
        val producto = valor1 * valor2
        println("La resta de $valor1 y $valor2 es $producto")
    }
}
fun main() {
    val operaciones1 = Operaciones()
    operaciones1.cargar()
}