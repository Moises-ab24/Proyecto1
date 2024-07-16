package Concepto_Funciones
/*
Desarrollar una función que solicite la carga de tres valores y muestre el
menor. Desde la función main del programa llamar 2 veces a dicha función (sin
utilizar una estructura repetitiva)
 */

fun menor(){
    print("Ingrese el primer valor:")
    val num1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val num2 = readln().toInt()
    print("Ingrese el tercer valor:")
    val num3 = readln().toInt()
    when{
        num1 < num2 && num1 < num3 -> println("El valor menor es $num1")
        num2 < num1 && num2 < num3 -> println("El valor menor es $num2")
        else -> println("El valor menor es $num3")
    }
    println("****************************")
}

fun main() {
    menor()
    menor()
}