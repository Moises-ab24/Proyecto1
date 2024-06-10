fun main (){
    /*
    Problema 1
    Escribir un programa que solicite la carga de un número entre 0 y 999, y nos muestre
    un mensaje de cuántos dígitos tiene el mismo. Finalizar el programa cuando se
    cargue el valor 0.
     */
    /*
    do {
        print("Ingrese un valor comprendido entre 0 y 999:")
        val valor = readln().toInt()
        if (valor < 10)
            println("El valor ingresado tiene un dígito")
        else
            if (valor < 100)
                println("El valor ingresado tiene dos dígitos")
            else
                println("El valor ingresado tiene tres dígitos")
    } while (valor != 0)
    */

    /*
    Problema 2
    Escribir un programa que solicite la carga de números por teclado, obtener su
    promedio. Finalizar la carga de valores cuando se cargue el valor 0.
     */
    /*
    var cant = 0
    var suma = 0
    do {
        print("Ingrese un valor (0 para finalizar):")
        val valor = readln().toInt()
        if (valor != 0) {
            suma += valor
            cant++
        }
    } while (valor !=0)
    if (cant != 0) {
        val promedio = suma / cant
        print("El promedio de los valores ingresados es: $promedio")
    } else
        print("No se ingresaron valores.")
    */

    /*
    Problema 3
    Realizar un programa que permita ingresar el peso (en kilogramos) de piezas. El
    proceso termina cuando ingresamos el valor 0.
    Se debe informar:
    a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más de
    10.2 Kg.? y cuántas con menos de 9.8 Kg.?
    b) La cantidad total de piezas procesadas.
     */
    /*
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do {
        print("Ingrese el peso de la pieza (0 pera finalizar):")
        val peso = readln().toDouble()
        if (peso > 10.2)
            cant1++
        else
            if (peso >= 9.8)
                cant2++
            else
                if (peso > 0)
                    cant3++
    } while(peso != 0.0)
    println("Piezas aptas: $cant2")
    println("Piezas con un peso superior a 10.2: $cant1")
    println("Piezas con un peso inferior a 9.8: $cant3");
    val suma = cant1 + cant2 + cant3
    println("Cantidad total de piezas procesadas: $suma")
     */

    /*
    Realizar un programa que acumule (sume) valores ingresados por teclado
    hasta ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la
    carga). Imprimir el valor acumulado e informar si dicho valor es cero, mayor a
    cero o menor a cero.
     */
    /*
    var sum = 0
    do {
        print("Ingrese un valor (Ingrese el numero 9999 para finalizar): ")
        val num: Int = readln().toInt()
        if (num < 9999){
            sum+=num }
    }while(num != 9999)
        if (sum != 9999) {
            println("El valor acumulado es $sum")
        }
        else
            if(sum == 9999) {
        println("No se ingresaron datos") }
        if(sum == 0){
            println("El valor acumuldo es 0") }
        else
            if(sum > 0) {
                println("El valor acumulado es mayor a 0") }
        else
                if(sum < 0) {
                println("El valor acumulado es menor a 0") }
    */

    /*
    En un banco se procesan datos de las cuentas corrientes de sus clientes. De
    cada cuenta corriente se conoce: número de cuenta y saldo actual. El ingreso de
    datos debe finalizar al ingresar un valor negativo en el número de cuenta.
    Se pide confeccionar un programa que lea los datos de las cuentas corrientes e
    informe:
    a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo,
    sabiendo que.
    b) La suma total de los saldos acreedores.
     */
    var sum = 0
    do {
        println("Ingrese un numero de cuenta: ")
        val numcuenta: Int = readln().toInt()
        println("Ingrese el saldo actual: ")
        val saldo: Double = readln().toDouble()
        sum = sum + saldo
    }while(numcuenta < 0)
    if (saldo > 0)


}