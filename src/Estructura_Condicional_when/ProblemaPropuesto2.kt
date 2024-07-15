package Estructura_Condicional_when

fun main() {
    //Plantear una estructura que se repita 5 veces y dentro de la misma cargar 3
    //valores enteros. Acumular solo el mayor del cada lista de tres valores.
    var mayor = 0
    for(i in 1..5){
        print("Ingrese el primer valor:")
        val num1 = readln().toInt()
        print("Ingrese el segundo valor:")
        val num2 = readln().toInt()
        print("Ingrese el tercer valor:")
        val num3 = readln().toInt()
        mayor += when{
            num1 > num2 && num1 > num3 -> num1
            num2 > num1 && num2 > num3 -> num2
            else -> num3
        }
    }
    println("El valor acumulado de los valores mayores de cada lista de 3 numeros es: $mayor")
}