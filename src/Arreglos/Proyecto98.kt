package Arreglos

/*
Se desea guardar los sueldos de 5 operarios.
Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto
momento los 5 sueldos almacenados en memoria.
Empleando un arreglo solo se requiere definir un único nombre y accedemos a cada
elemento por medio del subíndice.
 */

fun main() {
    val sueldos: IntArray
    sueldos = IntArray(5)
    //carga de sus elementos por teclado
    for (i in 0..4) {
        print("Ingrese sueldo:")
        sueldos[i] = readln().toInt()
    }
    //impresion de sus elementos
    for(i in 0..4) {
        println(sueldos[i])
    }
}

/*
Un arreglo es una estructura de datos que permite almacenar un CONJUNTO de
datos del MISMO tipo.
 */