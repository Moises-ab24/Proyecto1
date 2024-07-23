package Funciones_Argumentos_Nombrados

/*
Confeccionar una función que reciba el nombre de un operario, el pago por hora y la
cantidad de horas trabajadas. Debe mostrar su sueldo y el nombre. Hacer la llamada
de la función mediante argumentos nombrados.
 */

fun calcularSueldo(nombre: String, costoHora: Double, cantidadHoras: Int) {
    val sueldo = costoHora * cantidadHoras
    println("$nombre trabajó $cantidadHoras horas, se le paga por hora $costoHora por lo tanto le corresponde un sueldo de $sueldo")
}

fun main() {
    calcularSueldo("Juan", 10.5, 120)
    calcularSueldo(costoHora = 12.0, cantidadHoras = 40, nombre = "Ana")
    calcularSueldo(cantidadHoras = 90, nombre = "Luis", costoHora = 7.25)
    /*
    Podemos llamarla como ya conocemos indicando los valores directamente.
    Pero también podemos indicar los datos en cualquier orden pero con la obligación de
    anteceder el nombre del parámetro.
     */
}
