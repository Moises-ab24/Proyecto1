package Arreglos_Tipos_Funciones

/*
Cargar un arreglo de n elementos. Imprimir el menor elemento y un mensaje si
se repite dentro del arreglo.
 */

fun creararr(): IntArray {
    print("Ingrese n cantidad de datos que desea en el arreglo: ")
    val n = readln().toInt()
    val arreglo = IntArray(n)
    for (i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    return arreglo
}

fun mayor(arreglo: IntArray) : Int {
    var mayor = arreglo[0]
    for (i in arreglo)
        if (i > mayor)
            mayor = i
    return mayor
}

fun repite(arreglo: IntArray, nrepetido: Int): Boolean {
    var cant = 0
    for (i in arreglo)
        if (i == nrepetido)
            cant++
        if (cant > 1)
            return true
            else
            return false
}

fun main() {
    var arreglo = cargar()
    println("El valor mayor es ${mayor(arreglo)}")
    if (repite(arreglo,mayor(arreglo)))
        println("Se repite el mayor valor")
    else
        println("No se repite el mayor valor")
}