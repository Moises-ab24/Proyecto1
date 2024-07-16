package Estructura_Condicional_when_argumento

fun main() {
/*
Realizar la carga de la cantidad de hijos de 10 familias. Contar cuántos tienen
0,1,2 o más hijos. Imprimir dichos contadores.
*/
    var cant0 = 0
    var cant1 = 0
    var cant2 = 0
    var cantmashijos = 0
    for(i in 1..10) {
        print("Ingrese la cantidad de hijos de la familia:")
        val hijos = readln().toInt()
        when (hijos){
            0 -> cant0++
            1 -> cant1++
            2 -> cant2++
            else -> cantmashijos++
        }
    }
    println("Las familias con 0 hijos son: $cant0")
    println("Las familias con 1 hijo son: $cant1")
    println("Las familias con 2 hijos son: $cant2")
    println("Las familias con mas de 2 hijos son: $cantmashijos")

}