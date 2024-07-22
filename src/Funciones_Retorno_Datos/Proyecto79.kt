package Funciones_Retorno_Datos

/*
Confeccionar una función que le enviemos como parámetro el valor del lado de un
cuadrado y nos retorne su superficie.
 */

fun retornarSuperficie(lado: Int): Int {
    val sup = lado * lado
    return sup
}

fun main() {
    print("Ingrese el valor del lado del cuadrado:")
    val la = readln().toInt()
    val superficie = retornarSuperficie(la)
    println("La superficie del cuadrado es $superficie")
}