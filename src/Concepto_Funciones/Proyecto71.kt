package Concepto_Funciones
/*
Confeccionar una aplicación que solicite la carga de dos valores enteros y muestre
su suma.
Repetir la carga e impresión de la suma 5 veces.
Mostrar una línea separadora después de cada vez que cargamos dos valores y su
suma.
 */

fun cargarSuma() {
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}

fun separacion(){
    println("*******************************")
}

fun main() {
    for (i in 1..5) {
        cargarSuma()
        separacion()
    }
}
