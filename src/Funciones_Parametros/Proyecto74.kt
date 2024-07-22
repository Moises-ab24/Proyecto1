package Funciones_Parametros
/*
Confeccionar una aplicación que muestre una presentación en pantalla del
programa. Solicite la carga de dos valores y nos muestre la suma.

Mostrar finalmente un mensaje de despedida del programa.
 */

fun mostrarMensaje(mensaje: String) {
    println("*************************************************")
    println(mensaje)
    println("*************************************************")
}
fun cargarSumar() {
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}
fun main() {
    mostrarMensaje("El programa calcula la suma de dos valores ingresados por teclado.")
    cargarSumar()
    mostrarMensaje("Gracias por utilizar este programa")
/*
Ahora para resolver este pequeño problema hemos planteado una función llamada
mostrarMensaje que recibe como parámetro un String (cadena de caracteres) y lo
muestra en pantalla. Los parámetros van seguidos del nombre de la función encerrados entre paréntesis
(y en el caso de tener más de un parámetro los mismos deben ir separados por
coma
 */
}
