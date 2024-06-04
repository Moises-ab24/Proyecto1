fun main(){
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

}