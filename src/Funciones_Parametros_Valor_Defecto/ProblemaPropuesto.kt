package Funciones_Parametros_Valor_Defecto

/*
Confeccionar una función que reciba entre 2 y 5 enteros. La misma nos debe
retornar la suma de dichos valores. Debe tener tres parámetros por defecto
 */

fun sumar (v1: Int, v2: Int, v3: Int = 0, v4: Int = 0, v5: Int = 0) = v1+v2+v3+v4+v5

fun main() {
    println("La suma de 1 + 2 es ${sumar(1, 2)}")
    println("La suma de 1 + 2 + 3 es ${sumar(1, 2, 3)}")
    print("La suma de 1 + 2 + 3 + 4 + 5 es ${sumar(1, 2, 3, 4, 5)}")
}