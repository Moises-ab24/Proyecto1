fun main() {

    /*
    //Problema 1
    print("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()

    //Condicional if, si sueldo es mayor 3000
    //Imprimir "Debe pagar impuestos"

    if (sueldo > 3000){
        println ("Debe pagar impuestos")
    }
     */

    /*
    //Problema 2
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    if (valor1 > valor2) //Condicional con if y else
        print("El mayor valor es $valor1")
    else
        print("El mayor valor es $valor2")
     */

    /*
    //Problema 3
    print("Ingrese el primer valor:")
    val valor1: Int = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2: Int = readln().toInt()
    if (valor1 < valor2) {
        val suma: Int = valor1 + valor2
        val resta: Int = valor1 - valor2
        println("La suma de los dos valores es: $suma")
        println("La resta de los dos valores es: $resta")
    } else {
        val producto: Int = valor1 * valor2
        val division: Int = valor1 / valor2
        println("El producto de los dos valores es: $producto")
        println("La división de los dos valores es: $division")
    }
     */

    /*
    //Problema propuesto 1
    //Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".
    print("Ingrese la primera nota:")
    val nota1: Float = readln().toFloat()
    print("Ingrese la segunda nota:")
    val nota2: Float = readln().toFloat()
    print("Ingrese la tercera nota:")
    val nota3: Float = readln().toFloat()
    val promedio : Float = (nota1 + nota2 + nota3)/3
    println("El promedio del Estudiante es: $promedio")
    if (promedio >= 7) {
        println ("Promocionado")
    }
     */

    /*
    //Problema propuesto 2
    /*
    Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar
    un mensaje indicando si el número tiene uno o dos dígitos.
    (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un
    número entero)
     */
    print("Ingrese un numero del 1 al 99:")
    val num: Int = readln().toInt()
    if (num >= 9){
        println("El numero tiene 2 digitos")
    } else {
        println("El numero tiene 1 digito")
    }
     */

}
