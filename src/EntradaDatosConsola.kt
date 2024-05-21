fun main(){
    // Problema 1
    /*
    Realizar la carga de dos números enteros por teclado e imprimir su suma y su
    producto.
     */
    print("Ingrese primer valor: ")
    val valor1= readln().toInt()
    print("Ingrese segundo valor: ")
    val valor2= readln().toInt()
    val suma= valor1 + valor2
    println("La suma de $valor1 + $valor2 es $suma")
    val producto= valor1 * valor2
    println("El producto de $valor1 * $valor2 es $producto")
    //readln() captura la entrada del teclado
    //.toInt() convierte los datos de entrada a tipo numerico

    // Problema 2
    /*
    Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del
    mismo (El perímetro de un cuadrado se calcula multiplicando el valor del lado por
    cuatro).
     */
    print("Ingrese el lado el cuadrado: ")
    val lado= readln().toInt()
    val perimetro: Int
    perimetro= lado * 4
    println("El perimetro de un cuadrado es $perimetro")

    //Problema 3
    /*
    Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la
    cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.
     */
    print("Ingrese el precio de un producto que almaceno en el carrito: ")
    val precio= readln().toDouble()
    print("Ingrese la cantidad del producto que lleva: 2")
    val cantidad= readln().toInt()
    val total = precio * cantidad
    println("El monto a pagar es de $total")

    // Problema 4
    /*
    Escribir un programa en el cual se ingresen cuatro números enteros, calcular e
    informar la suma de los dos primeros y el producto del tercero y el cuarto.
     */
    print("Ingrese primer valor: ")
    val valor1= readln().toInt()
    print("Ingrese segundo valor: ")
    val valor2= readln().toInt()
    print("Ingrese tercer valor: ")
    val valor3= readln().toInt()
    print("Ingrese cuarto valor: ")
    val valor4= readln().toInt()
    val suma= valor1 + valor2
    val producto= valor3 * valor4
    println("La suma de $valor1 + $valor2 es $suma")
    println("El producto de $valor3 * $valor4 es $producto")

    // Problema 5
    /*
    Realizar un programa que lea por teclado cuatro valores numéricos enteros e
    informar su suma y promedio.
     */
    print("Ingrese primer valor: ")
    val valor1= readln().toInt()
    print("Ingrese segundo valor: ")
    val valor2= readln().toInt()
    print("Ingrese tercer valor: ")
    val valor3= readln().toInt()
    print("Ingrese cuarto valor: ")
    val valor4= readln().toInt()
    val suma= valor1 + valor2 + valor3 + valor4
    val producto= valor1 * valor2 * valor3 * valor4
    println("La suma de $valor1 + $valor2 + $valor3 + $valor4 es $suma")
    println("El producto de $valor1 * $valor2 * $valor3 * $valor4 es $producto")
}