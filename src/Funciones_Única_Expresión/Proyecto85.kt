package Funciones_Única_Expresión

/*
Confeccionar una función que le enviemos como parámetro el valor del lado de un
cuadrado y nos retorne su superficie.
 */

fun retornarSuperficie(lado: Int) = lado * lado
//Como podemos ver la implementación completa de la función es una sola línea

fun main() {
    print("Ingrese el valor del lado del cuafrado:")
    val la = readln().toInt()
    println("La superficie del cuadrado es ${retornarSuperficie(la)}")
}