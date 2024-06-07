fun main() {
    /*
    Problema 1
    Realizar un programa que imprima en pantalla los números del 1 al 100.
     */
    /*
    var x = 1
    while (x <= 100) {
        println(x)
        x = x + 1 }
     */

    /*
    Problema 2
    Escribir un programa que solicite la carga de un valor positivo y nos muestre desde 1
    hasta el valor ingresado de uno en uno.
    Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.
     */
    /*
    print("Ingrese un valor:")
    val valor = readln().toInt()
    var x = 1
    while (x <= valor) {
        println(x)
        x = x + 1 }
    */

    /*
    Problema 3
    Desarrollar un programa que permita la carga de 10 valores por teclado y nos
    muestre posteriormente la suma de los valores ingresados y su promedio.
     */
    /*
    var x = 1
    var suma = 0
    while (x <= 10) {
        print("Ingrese un valor:")
        val valor=readln().toInt()
        suma = suma + valor }
        x = x + 1
    println("La suma de los 10 valores ingresados es $suma")
    val promedio = suma / 10
    println("El promedio es $promedio")
    */

    /*
    Problema 4
    Una planta que fabrica perfiles de hierro posee un lote de n piezas.
    Confeccionar un programa que pida ingresar por teclado la cantidad de piezas a
    procesar y luego ingrese la longitud de cada perfil; sabiendo que la pieza cuya
    longitud esté comprendida en el rango de 1.20 y 1.30 son aptas. Imprimir por pantalla
    la cantidad de piezas aptas que hay en el lote.
     */
    /*
    print("Cuantas piezas procesará:")
    val n = readln().toInt()
    var x = 1
    var cantidad = 0
    while (x <= n) {
        print("Ingrese la medida de la pieza:")
        val largo = readln().toDouble()
        if (largo >= 1.20 && largo <= 1.30)
            cantidad = cantidad + 1
        x = x + 1; }
    print("La cantidad de piezas aptas son: $cantidad")
    */

    /*
    Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
    cuántos tienen notas mayores o iguales a 7 y cuántos menores.
     */
    /*
    var x = 1
    var notasmax = 0
    var notasmin = 0
    while (x <= 10) {
        print("Ingrese la nota del estudiante:")
        val nota: Int = readln().toInt()
        x = x + 1
        if(nota >= 7 && nota < 10)
            notasmax = notasmax + 1
        else
            notasmin = notasmin + 1 }
    println("La cantidad de notas que aprobaron son: $notasmax")
    println("La cantidad de notas que reprobaron son: $notasmin")
    */

    /*
    Se ingresan un conjunto de n alturas de personas por teclado (n se ingresa
    por teclado). Mostrar la altura promedio de las personas.
     */
    /*
    var x = 1
    print("Ingrese el numero de alturas que desea ingresar:")
    val n: Int = readln().toInt()
    var suma = 0.0
    while (x <= n) {
        print("Ingrese la altura:")
        val altura: Double = readln().toDouble()
        suma = suma + altura
        x = x + 1
    }
    val promedio = suma/n
    println("La altura promedio de las personas es: $promedio")
    */

    /*
    En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y
    $500, realizar un programa que lea los sueldos que cobra cada empleado e
    informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más
    de $300. Además el programa deberá informar el importe que gasta la
    empresa en sueldos al personal.
     */
    /*
    var x = 1
    print("Ingrese la cantidad de empleados:")
    val n: Int = readln().toInt()
    var suma = 0
    var sueldomin = 0
    var sueldomax = 0
    while (x <= n) {
        print("Ingrese el sueldo del empleado:")
        val sueldo: Int = readln().toInt()
        suma = suma + sueldo
        x = x + 1
        if(sueldo >= 100 && sueldo <= 300)
            sueldomin = sueldomin + 1
        else
            if(sueldo >= 300 && sueldo <= 500)
                sueldomax = sueldomax + 1
    }
    val importe = suma*n
    println("Los cantidad de empleados que cobran entre $100 y $300 son: $sueldomin")
    println("Los cantidad de empleados que cobran más de $300 son: $sueldomax")
    println("El importe que gasta la empresa es de $importe dolares")
    */

    /*
    Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44,
    etc. (No se ingresan valores por teclado)
     */
    /*
    var x = 11
    while (x <= 275) {
        println("$x")
        x = x + 11
    }
    */

    /*
    Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16
    - 24, etc.
     */
    /*
    var x = 8
    while (x <= 500) {
        println("$x")
        x = x + 8
    }
    */

    /*
     Realizar un programa que permita cargar dos listas de 5 valores cada una.
    Informar con un mensaje cual de las dos listas tiene un valor acumulado
    mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
    Tener en cuenta que puede haber dos o más estructuras repetitivas en un
    algoritmo.
     */
    /*
    var x = 1
    var x2 = 1
    var suma1 = 0
    var suma2 = 0
    println("Lista 1")
    while (x <= 5) {
        print("Ingrese un valor:")
        val vall1: Int = readln().toInt()
        suma1 = suma1 + vall1
        x = x + 1
    }
    println("Lista 2")
    while (x2 <= 5) {
        print("Ingrese un valor:")
        val vall2: Int = readln().toInt()
        suma2 = suma2 + vall2
        x2 = x2 + 1
    }
    if(suma1 == suma2)
        println("Listas iguales")
    else
        if(suma1 > suma2)
            println("Lista 1 mayor")
    else
        if(suma2 > suma1)
            println("Lista 2 mayor")
    */

    /*
    Desarrollar un programa que permita cargar n números enteros y luego nos
    informe cuántos valores fueron pares y cuántos impares.
    Emplear el operador "%" en la condición de la estructura condicional:
     */
    /*
    var x = 1
    var pares = 0
    var impares = 0
    print("Ingrese la cantidad de numeros deseada a ingresar:")
    val n : Int = readln().toInt()
    while (x <= n) {
        print("Ingrese un numero:")
        val num: Int = readln().toInt()
        x = x + 1
        if (num % 2 == 0)
            pares = pares + 1
        else
            impares = impares + 1
    }
    println("La cantidad de numero pares es: $pares")
    println("La cantidad de numero impares es: $impares")
    */
}