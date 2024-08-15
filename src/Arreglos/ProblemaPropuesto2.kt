package Arreglos

/*
 Realizar un programa que pida la carga de dos arreglos numéricos enteros de
4 elementos. Obtener la suma de los dos arreglos elemento a elemento, dicho
resultado guardarlo en un tercer arreglo del mismo tamaño.
 */

fun main() {
    val arreglo1: IntArray
    arreglo1 = IntArray(4)
    val arreglo2: IntArray
    arreglo2 = IntArray(4)
    val arreglo3: IntArray
    arreglo3 = IntArray(4)

    for (i in 0..arreglo1.size-1) {
        print("Ingrese un valor entero del primer arreglo:")
        arreglo1[i] = readln().toInt()
    }
    println("**************************************************")
    for (i in 0..arreglo2.size-1) {
        print("Ingrese un valor entero del segundo arreglo:")
        arreglo2[i] = readln().toInt()
    }
    println("**************************************************")
    for (i in 0..arreglo3.size-1) {
        arreglo3[i] = arreglo1[i] + arreglo2[i]
        println ("El resultado de ${arreglo1[i]} + ${arreglo2[i]} es: ${arreglo3[i]}")
    }
}