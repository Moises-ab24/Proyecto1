package Funciones_Retorno_Datos

/*
Elaborar una función que reciba tres enteros y nos retorne el valor promedio
de los mismos.
 */

fun retornarPromedio (v1: Int, v2: Int, v3: Int): Int {
    val pro = (v1+v2+v3)/3
    return pro
}

fun main() {
    print("Ingrese el primer valor entero:")
    val v1 = readln().toInt()
    print("Ingrese el segundo valor entero:")
    val v2 = readln().toInt()
    print("Ingrese el tercer valor entero:")
    val v3 = readln().toInt()
    val promedio = retornarPromedio(v1, v2, v3)
    println("El promedio de los tres enteros es $promedio")
}