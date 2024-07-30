package Arreglos_Tipos_Funciones

/*
Definir en la función main un arreglo de enteros de 5 elementos. Declarar dos
funciones, en una efectuar la carga de sus elementos y en la otra su impresión.
 */

fun cargar(arreglo: IntArray) {
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
}
fun imprimirr(arreglo: IntArray) {
    for(elemento in arreglo)
        println(elemento)
}
fun main() {
    val arre = IntArray(5)
    cargar(arre)
    imprimirr(arre)
}