package Funciones_Argumentos_Nombrados

/*
Elaborar una función que muestre la tabla de multiplicar del valor que le
enviemos como parámetro. Definir un segundo parámetro llamado termino que
por defecto almacene el valor 10. Se deben mostrar tantos términos de la tabla
de multiplicar como lo indica el segundo parámetro.
Llamar a la función desde la main con argumentos nombrados
 */

fun tablaMultiplicar (num: Int, rango: Int = 10) {
    for (i in 1..rango) {
        println("$num * $i = ${num * i}")
    }
}
fun main() {
    print("Ingrese el valor de la tabla:")
    val num = readln().toInt()
    print("Ingrese la cantidad de terminos de la tabla:")
    val rango = readln().toInt()
    println("*************************")
    print("Tabla de multiplicar del $num")
    tablaMultiplicar(rango = rango, num = num)
}