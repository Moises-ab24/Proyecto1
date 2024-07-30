package Arreglos_Tipos_Funciones

/*
Se desea almacenar los sueldos de operarios. Cuando se ejecuta el programa se
debe pedir la cantidad de sueldos a ingresar. Luego crear un arreglo con dicho
tamaño.
Definir una función de carga y otra de impresión.
 */

fun cargar(): IntArray {
    print("Cuantos sueldos quiere cargar:")
    val cantidad = readln().toInt()
    val sueldos = IntArray(cantidad)
    for(i in sueldos.indices) {
        print("Ingrese elemento:")
        sueldos[i] = readln().toInt()
    }
    return sueldos
}
fun imprimir(sueldos: IntArray) {
    println("Listado de todos los sueldos")
    for(sueldo in sueldos)
        println(sueldo)
}
fun main() {
    val sueldos = cargar()
    imprimir(sueldos)
}