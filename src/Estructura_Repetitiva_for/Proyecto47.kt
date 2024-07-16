package Estructura_Repetitiva_for
fun main() {

/*
Si necesitamos conocer si un valor se encuentra dentro de un rango debemos
emplear el operador in o el !in:
 */
    val docena = 1..12
    if (5 in docena)
        println("el 5 está en el rango docena")
    if (18 !in docena)
        println("el 18 no está en el rango docena")




//Realizar un programa que imprima en pantalla los números del 1 al 100.
    for(index in 1..100){
        println("$index")
    }

}