package Funciones_Retorno_Datos

/*
Confeccionar una función que calcule la superficie de un rectángulo y la retorne,
la función recibe como parámetros los valores de dos de sus lados.
En la función main del programa cargar los lados de dos rectángulos y luego
mostrar cual de los dos tiene una superficie mayor.
 */

fun retornarSuperficie(lado1: Int,lado2: Int): Int {
    val sup = lado1*lado2
    return sup
}

fun main() {
    print("Escriba el primer lado del primer rectangulo:")
    val la1 = readln().toInt()
    print("Escriba el segundo lado del primer rectangulo:")
    val la2 = readln().toInt()
    print("Escriba el primer lado del segundo rectangulo:")
    val la3 = readln().toInt()
    print("Escriba el segundo lado del segundo rectangulo:")
    val la4 = readln().toInt()
    if (retornarSuperficie(la1, la2) == (retornarSuperficie(la3, la4)))
        print("Las dos superficies de los 2 rectangulos son iguales")
    else
    if (retornarSuperficie(la1, la2) > (retornarSuperficie(la3, la4)))
        print("El primer rectangulo tiene una superficie mayor, su superficie es ${retornarSuperficie(la1, la2)}")
    else
        print("El segundo rectangulo tiene una superficie mayor, su superficie es ${retornarSuperficie(la3, la4)}")
}