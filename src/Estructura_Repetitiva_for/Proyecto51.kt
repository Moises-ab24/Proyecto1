package Estructura_Repetitiva_for

fun main() {
/*
Escribir un programa que lea n números enteros y calcule la cantidad de valores
pares ingresados.
 */

    var cant = 0
    print("Cuantos valores ingresará para analizar:")
    val cantidad = readln().toInt()
    for(i in 1..cantidad) {
        print("Ingrese valor:")
        val valor = readln().toInt()
        if (valor % 2 ==0)
            cant++
    }
    println("Cantidad de pares: $cant")


/*
Si necesitamos que la variable del for no reciba todos los valores comprendidos en el
rango sino que avance de 2 en 2 podemos utilizar la siguiente sintaxis:
 */

    for(i in 1..10 step 2)
        println(i)


/*
Si necesitamos que la variable tome el valor 10, luego el 9 y así sucesivamente, es
decir en forma inversa debemos utilizar la siguiente sintaxis:
 */

    for(i in 10 downTo 1)
        println(i)


//También podemos utilizar el step con el downTo

//Podemos utilizar la siguiente variante de for que tendrá sentido cuando recorramos
//arreglos:

    for(x in 0 until 10)
        println(x)

}