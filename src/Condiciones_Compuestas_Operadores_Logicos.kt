fun main(){
    /*
    Realizar un programa que pida cargar una fecha cualquiera, luego verificar si
    dicha fecha corresponde a Navidad.
     */
    /*
    print("Ingrese día:")
    val dia = readln().toInt()
    print("Ingrese mes:")
    val mes = readln().toInt()
    if (dia == 24 || mes == 12)
    print("Corresponde a la fecha de navidad")
    */


    /*
    Se ingresan tres valores por teclado, si todos son iguales calcular el cubo del
    número y mostrarlo.
     */
    /*
    print("Ingrese primer valor:")
    val num1 = readln().toInt()
    print("Ingrese segundo valor:")
    val num2 = readln().toInt()
    print("Ingrese tercer valor:")
    val num3 = readln().toInt()
    val cubo = (num1*num2*num3)
    if(num1 == num2 || num1 == num3)
        print("El cubo de los numeros es $cubo")
    */

    /*
    Se ingresan por teclado tres números, si todos los valores ingresados son
    menores a 10, imprimir en pantalla la leyenda "Todos los números son
    menores a diez".
     */
    /*
    print("Ingrese primer valor:")
    val num1 = readln().toInt()
    print("Ingrese segundo valor:")
    val num2 = readln().toInt()
    print("Ingrese tercer valor:")
    val num3 = readln().toInt()
    if(num1 > 10 || num2 > 10 || num3 > 10)
        print("Todos son menores a diez")
    */


    /*
    Escribir un programa que pida ingresar la coordenada de un punto en el plano,
    es decir dos valores enteros x e y (distintos a cero).
    Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
    (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
     */
    /*
    print("Ingrese coordenada x:")
    val x: Int = readln().toInt()
    print("Ingrese coordenada y:")
    val y: Int = readln.toInt()
    if (x > 0 && y > 0)
        print("Esta en el primer cuadrante")
    else
        if(x < 0 && y > 0)
            print ("Esta en el segundo cuadrante")
    else
        if(x < 0 && y < 0)
            print("Esta en el tercer cuadrante")
    else
        if(x > 0 && y < 0)
            print("Este es el cuarto cuadrante")
    else
        print("Esta en un eje")
    */


    /*
    Escribir un programa en el cual: dada una lista de tres valores enteros
    ingresados por teclado se guarde en otras dos variables el menor y el mayor de esa lista. Utilizar el if como expresión para obtener el mayor y el menor.
    Imprimir luego las dos variables.
     */
    /*
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    val menor = if (valor1 < valor2 && valor1 < valor3)
        valor1 else if (valor2 < valor3) valor2 else valor3
    val mayor = if (valor1 > valor2 && valor1 > valor3)
        valor1 else if (valor2 > valor3) valor2 else valor3
    print("El mayor de la lista es $mayor y el menor de la lista es $menor")
     */
}
