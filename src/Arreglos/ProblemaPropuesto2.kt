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
    arreglo3 = IntArray(1)
    var suma = 0
    for (i in 0..arreglo1.size-1){
        print("Ingrese un valor entero del primer arreglo:")
        arreglo1[i] = readln().toInt()
        suma += arreglo1[i]
    }

    for (i in 0..arreglo2.size-1){
        print("Ingrese un valor entero del segundo arreglo:")
        arreglo2[i] = readln().toInt()
        suma += arreglo2[i]
    }

    for (i in 0..arreglo3.size-1) {
        println("La suma de los 2 arreglos es $suma")
    }
}
