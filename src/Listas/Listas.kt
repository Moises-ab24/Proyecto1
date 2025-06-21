package Listas

fun main() {
    println("-----------MUTABLE LIST-----------")
    mutableList()
    println("-----------INMUTABLE LIST-----------")
    inmutableList()
}

fun mutableList(){
    val weekDays = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(0,"Day")
    println(weekDays)

    if(weekDays.isEmpty())
        //No voy a pintar nada porque no hay
        else
            weekDays.forEach { println(it) }
}

fun inmutableList(){
    val readOnly = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
/*
    println(readOnly.indices)
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.first())
    println(readOnly.last())
*/

    //Filtrar
    val example = readOnly.filter { it.contains ("a") }
    println(example)

    //Iterar
    readOnly.forEach { println(it) }
    //weekDay -> println(weekDay) es lo mismo que println(it)
}