package Estructura_Condicional_when

fun main() {
    //Ingresar los sueldos de 10 empleados por teclado. Mostrar un mensaje según el
    //valor del sueldo:
    //"sueldo alto" si es > 5000
    //"sueldo medio" si es <=5000 y > 2000
    //"sueldo bajo" si es <= 2000
    //Además mostrar el total acumulado de gastos en sueldos altos.
    var total = 0
    for(i in 1..10) {
        print("ingrese sueldo del operario:")
        val sueldo = readln().toInt()
        total += when {
            sueldo > 5000 -> {
                println("Sueldo alto")
                sueldo
            }
            sueldo > 2000 -> {
                println("Sueldo medio")
                0
            }
            else -> {
                println("Sueldo bajo")
                0
            }
        }
    }
    println("Gastos totales en sueldos altos: $total")
}