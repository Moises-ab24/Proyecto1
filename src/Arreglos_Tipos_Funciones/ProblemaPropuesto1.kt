package Arreglos_Tipos_Funciones

/*
Desarrollar un programa que permita ingresar un arreglo de n elementos,
ingresar n por teclado.
Elaborar dos funciones una donde se lo cree y cargue al arreglo y otra que
sume todos sus elementos y retorne dicho valor a la main donde se lo
imprima.
 */

fun crear(): IntArray {
    print("Ingrese n cantidad de datos que desea en el arreglo: ")
    val n = readln().toInt()
    val arreglo = IntArray(n)
    for (i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    return arreglo
}

fun suma(arreglo: IntArray): Int {
    var suma = 0
    for (i in arreglo)
        suma += i
    return suma
}

fun main() {
    var arreglo = cargar()
    println("La suma de todos los elementos del arreglo es ${suma(arreglo)}")
}


