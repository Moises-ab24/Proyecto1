package Concepto_Funciones
//Confeccionar una aplicación que muestre una presentación en pantalla del
//programa. Solicite la carga de dos valores y nos muestre la suma. Mostrar finalmente
//un mensaje de despedida del programa.
//Implementar estas actividades en tres funciones.

fun presentacion(){
    println("Programa que permite cargar dos valores por teclado.")
    println("Efectua la suma de dos valores")
    println("Muestra el resultado de la suma")
    println("*******************************")
}

fun cargarSumar(){
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}

fun finalizacion(){
    println("*******************************")
    println("Gracias por utilizar este programa")
}
fun main() {
    presentacion()
    cargarSumar()
    finalizacion()
    //Las funciones se colocan antes de la funcion main
}