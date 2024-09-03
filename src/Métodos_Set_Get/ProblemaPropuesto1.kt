package Métodos_Set_Get

/*
Confeccionar una clase que represente un Empleado. Definir como
propiedades su nombre y su sueldo.
No permitir que se cargue un valor negativo en su sueldo.
Codificar el método imprimir en la clase.
 */

class empleado (var nombre: String, sueldo: Double){
    var sueldo: Double = 0.0
        set(valor) {
            if (valor < 0)
                field = 0.0
            else
                field = valor
        }

    init {
        this.sueldo = sueldo
    }

    fun imprimir() {
        println("$nombre tiene $sueldo de sueldo")
    }
}

fun main() {
    val empleado1 = empleado("El MilloGangster", 300.000)
    empleado1.imprimir()
    val empleado2 = empleado("El Mynor", -300.000)
    empleado2.imprimir()
}