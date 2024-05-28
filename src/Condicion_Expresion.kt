fun main(){

    /*
    //Problema 1
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("El mayor entre $valor1 y $valor2 es $mayor")
    /*
    Como podemos ver asignamos a una variable llamada mayor el valor que devuelve
    la expresión if. Si la condición del if es verdadera retorna el contenido de la variable
    valor1 y sino retorna valor2
     */
     */

    /*
    //Problema 2
    print("Ingrese un valor entero:")
    val valor = readln().toInt()
    val resultado = if (valor % 2 == 0) {
        print("Cuadrado:")
        valor * valor
    } else {
        print("Cubo:")
        valor * valor * valor
    }
    print(resultado)
     */

    //Problema propuesto 1
    /*
    Cargar un valor entero por teclado comprendido entre 1 y 99. Almacenar en
    otra variable la cantidad de dígitos que tiene el valor ingresado por teclado.
    Mostrar la cantidad de dígitos del número ingresado por teclado.
     */
    print("Ingrese un numero entre 1 y 99:")
    val num = readln().toInt()
    val cant = if (num >= 10) println("$num tiene 2 digitos") else println("$num tiene un digito")
    
}
