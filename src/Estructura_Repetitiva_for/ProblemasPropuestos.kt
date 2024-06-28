package Estructura_Repetitiva_for

fun main() {
    //Confeccionar un programa que lea n pares de datos, cada par de datos
    //corresponde a la medida de la base y la altura de un triángulo. El programa
    //deberá informar:
    //a) De cada triángulo la medida de su base, su altura y su superficie (la
    //superficie se calcula multiplicando la base por la altura y dividiendo por dos).
    //b) La cantidad de triángulos cuya superficie es mayor a 12.
    /*
    var super12 = 0
    print("Ingrese el n de triangulos que desea ingresar con sus pares de datos: ")
    val n = readln().toInt()
    for (i in 1..n){
        print("Ingrese la base del triangulo: ")
        val base = readln().toInt()
        print("Ingrese la altura del triangulo: ")
        val h = readln().toInt()
        val superficie = (base*h)/2
        if (superficie >= 12){
            super12++}
        println("La medida de la base de este triangulo es: $base, la medida de la altura es: $h, y su superficie es: $superficie")
    }
    println("La cantidad de triangulos con superficie mayor a 12 son: $super12")
     */


    //Desarrollar un programa que solicite la carga de 10 números e imprima la
    //suma de los últimos 5 valores ingresados.
    /*
    var suma = 0
    for (i in 1..10) {
        print("Ingrese un número: ")
        val num = readln().toInt()
        if (i > 5){
            suma += num }
    }
    println("La suma de los ultimos 5 numeros ingresados es: $suma")
    */


    //Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)
    /*
    println("Tabla de multiplicar del 5")
    for(i in 5..50 step 5){
        println("$i")}
    */


    //Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos
    //muestre la tabla de multiplicar del mismo (los primeros 12 términos)
    //Ejemplo: Si ingresó 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el
    //36.
    /*
    print("Ingrese un valor del 1 al 10: ")
    val num = readln().toInt()
    println("Tabla de multiplicar del $num")
    for(i in num..num*12 step num){
        println("$i")
    }
    */


    //Realizar un programa que lea los lados de n triángulos, e informar:
    //a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados
    //iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
    //b) Cantidad de triángulos de cada tipo.
    /*
    var equilatero = 0
    var isosceles = 0
    var escaleno = 0
    print("Ingrese la cantidad de triangulos que desea ingresar con los datos de sus lados: ")
    val n = readln().toInt()
    for (i in 1..n){
        print("Ingrese el primer lado del triangulo: ")
        val l1 = readln().toInt()
        print("Ingrese el segundo lado del triangulo: ")
        val l2 = readln().toInt()
        print("Ingrese el tercer lado del triangulo: ")
        val l3 = readln().toInt()
        if (l1 == l2 && l1 == l3){
            println("El tipo de triangulo es equilátero")
            equilatero++
        }else
            if (l1 == l2 || l2 == l3 || l1 == l3){
                println("El tipo de triangulo es isosceles")
                isosceles++
            }else {
                println("El tipo de triangulo es escaleno")
                escaleno++
            }
    }
    println("La cantidad de triangulos equilateros es: $equilatero")
    println("La cantidad de triangulos isosceles es: $isosceles")
    println("La cantidad de triangulos escaleno es: $escaleno")
    */


    //Escribir un programa que pida ingresar coordenadas (x,y) que representan
    //puntos en el plano.
    //Informar cuántos puntos se han ingresado en el primer, segundo, tercer y
    //cuarto cuadrante. Al comenzar el programa se pide que se ingrese la cantidad
    //de puntos a procesar.
    /*
    var cuad1 = 0
    var cuad2 = 0
    var cuad3 = 0
    var cuad4 = 0
    print("Ingrese la cantidad de puntos en un plano cartesiano que desea procesar: ")
    val n = readln().toInt()
    for (i in 1..n){
        print("Ingrese la coordenada x: ")
        val x = readln().toInt()
        print("Ingrese la coordenada y: ")
        val y = readln().toInt()
        if (x > 0 && y > 0){
            cuad1++
        }else
            if (x < 0 && y > 0){
                cuad2++
            }else
                if (x < 0 && y < 0){
                    cuad3++
                }else
                    if (x > 0 && y < 0){
                        cuad4++
                    }
    }
    println("La cantidad de puntos en el primer cuadrante es: $cuad1")
    println("La cantidad de puntos en el segundo cuadrante es: $cuad2")
    println("La cantidad de puntos en el tercer cuadrante es: $cuad3")
    println("La cantidad de puntos en el cuarto cuadrante es: $cuad4")
    */


    //Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
    //a) La cantidad de valores ingresados negativos.
    //b) La cantidad de valores ingresados positivos.
    //c) La cantidad de múltiplos de 15.
    //d) El valor acumulado de los números ingresados que son pares.
    /*
    var negativos = 0
    var positivos = 0
    var mul15 = 0
    var sumapar = 0
    for (i in 1..10){
        print("Ingrese un número: ")
        val num = readln().toInt()
        if (num < 0){
            negativos++
        }else
            if (num >= 0){
                positivos++}
        if (num % 15 == 0){
            mul15++}
        if (num % 2 == 0){
            sumapar+=num }
    }
    println("La cantidad de valores ingresados negativos es: $negativos")
    println("La cantidad de valores ingresados positivos es: $positivos")
    println("La cantidad de valores que son multiplos de 15 es: $mul15")
    println("El valor acumulado de los valores pares es: $sumapar")
    */
}