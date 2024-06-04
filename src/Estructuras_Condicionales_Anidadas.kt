fun main (){
        /*
        Problema 1
    Confeccionar un programa que pida por teclado tres notas de un alumno,
    calcule el promedio e imprima alguno de estos mensajes:
    Si el promedio es >=7 mostrar "Promocionado"
    Si el promedio es >=4 y <7 mostrar "Regular"
    Si el promedio es <4 mostrar "Reprobado"
        */
    /*
    print("Ingrese primer nota:")
    val nota1: Int = readln().toInt()
    print("Ingrese segunda nota:")
    val nota2: Int = readln().toInt()
    print("Ingrese tercera nota:")
    val nota3: Int = readln().toInt()
    val promedio = (nota1+nota2+nota3)/3
    if(promedio >= 7)
        print("Promocionado")
    else
        if(promedio >=4)
            print("Regular")
        else
            print("Reprobado")
     */
    /*
    print("Ingrese primer nota:")
    val nota1: Int = readln().toInt()
    print("Ingrese segunda nota:")
    val nota2: Int = readln().toInt()
    print("Ingrese tercera nota:")
    val nota3: Int = readln().toInt()
    val promedio = (nota1+nota2+nota3)/3

    val estado = if(promedio >= 7) "Promocionado" else if(promedio < 4) "Regular" else "Reprobado"
    print("Estado del alumno:$estado")
     */


    /*
    Problema propuesto 1
    Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de
    ellos.
     */
    /*
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    if (valor3 > valor2)
        print("El mayor valor es $valor3")
    else
        if (valor2 > valor1)
        print("El mayor valor es $valor2")
    else
        print("El mayor valor es $valor1")
    */


    /*
    Problema propuesto 3
    Confeccionar un programa que permita cargar un número entero positivo de
    hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
    Mostrar un mensaje de error si el número de cifras es mayor.
     */
    /*
    print("Ingrese un numero del 1 al 999:")
    val num: Int = readln().toInt()
    if(num > 999)
        print("ERROR, El numero de cifras es mayor")
    else
    if(num > 99)
        print("El numero tiene 3 cifras")
    else
        if(num > 9)
            print("El numero tiene 2 cifras")
        else
            print("El numero tiene 1 cifra")
    */


    /*
    Problema propuesto 4
    Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
    siguiente información: cantidad total de preguntas que se le realizaron y la
    cantidad de preguntas que contestó correctamente. Se pide confeccionar un
    programa que ingrese los dos datos por teclado e informe el nivel del mismo
    según el porcentaje de respuestas correctas que ha obtenido, y sabiendo los niveles.
     */
    /*
    print("Ingrese el numero de preguntas que realizo:")
    val preguntastotal : Int = readln().toInt()
    print("Ingrese el numero de preguntas contestadas correctamente:")
    val preguntasbuenas : Int = readln().toInt()
    val porcentaje: Float = preguntasbuenas/preguntastotal.toFloat()
    println("El porcentaje es: $porcentaje")
        if(porcentaje >= 0.9)
        print("Nivel màximo logrado")
        if(porcentaje >= 0.75 && porcentaje < 0.9)
            print("Nivel medio logrado")
        if(porcentaje >= 0.5 && porcentaje < 0.75)
            print("Nivel regular logrado")
    else
        print("Fuera de nivel")
    */
}
