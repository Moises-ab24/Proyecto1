package Estructura_Condicional_when_argumento

fun main() {
    //Ingresar un valor entero comprendido entre 1 y 5. Mostrar el mismo en castellano.
    print("Ingrese un valor entero entre 1 y 5:")
    val valor = readln().toInt()
    when (valor) {
        1 -> print("Uno")
        2 -> print("Dos")
        3 -> print("Tres")
        4 -> print("Cuatro")
        5 -> print("Cinco")
        else -> print("valor fuera de rango")
        //Como vemos disponemos luego de la palabra clave when entre paréntesis una
        //variable. Se verifica el contenido de la variable "valor" con cada uno de los datos
        //indicados.
    }
}