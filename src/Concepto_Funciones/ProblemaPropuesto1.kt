package Concepto_Funciones
//Desarrollar un programa con dos funciones. La primer solicite el ingreso de un
//entero y muestre el cuadrado de dicho valor. La segunda que solicite la carga
//de dos valores y muestre el producto de los mismos. LLamar desde la main a
//ambas funciones.

fun cuadrado(){
    print("Ingrese un numero entero:")
    val num = readln().toInt()
    val cuad = num*num
    println("El cuadrado del $num es $cuad")
    println("**************************")
}

fun producto(){
    print("Ingrese el primer numero entero:")
    val num1 = readln().toInt()
    print("Ingrese el segundo numero entero:")
    val num2 = readln().toInt()
    val prod = num1*num2
    println("El producto de los numeros es $prod")
}
fun main() {
    cuadrado()
    producto()
}

