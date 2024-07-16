package Estructura_Condicional_when_argumento

fun main() {
    //Ingresar un valor entero positivo comprendido entre 1 y 10000. Imprimir un mensaje
    //indicando cuantos dígitos tiene.
    print("Ingrese un valor entero positivo comprendido entre 1 y 99999:")
    val valor = readln().toInt()
    when (valor){
        in 1..9 -> print("Tiene un digito")
        in 10..99 -> print("Tiene dos digito")
        in 100..999 -> print("Tiene tres digito")
        in 1000..9999 -> print("Tiene cuatro digito")
        in 10000..99999 -> print("Tiene cinco digito")
        else -> print("No se encuentra comprendido en el rango indicado")
    }
}