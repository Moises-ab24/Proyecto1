//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // print sirve para imprimir en consoloa
    print("hola mundo")

    // Variable de tipo numerico

    val edad: Int // declarar la variable y su tipo
    edad = 28 // valor de la variable
    val sueldo: Float // declarar la variable y su tipo
    sueldo= 1200.55f // valor de la variable
    val total: Double // declarar la variable y su tipo
    total= 70000.24 // valor de la variable
    val titulo: String // declarar la variable y su tipo
    titulo= "Sistema de ventas" // valor de la variable

    var mes: Int
    mes= 1
    // quiero cambiare el valor
    mes= 2

    // variable tipo Char permie almacenar un solo caracter
    var continuar: Char = 's'

    // variable tipo boolean true / false
    var fin: Boolean = false
    // sin ! es true
    // con ! es false

    // variable tipo Any cualquier cosa
    fun result(value: Any){
        when(value){
            is Int -> value + value
            is String -> println(value)
            is Boolean -> if (value) print("Hola")
        }
    }
}