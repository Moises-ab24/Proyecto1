package Constructores

/*
Implementar una clase llamada Alumno que tenga como propiedades su
nombre y su nota. Al constructor llega su nombre y nota.
Imprimir el nombre y su nota. Mostrar un mensaje si está regular (nota mayor
o igual a 4)
Definir dos objetos de la clase Alumno.
 */

class Alumno constructor(val nombre: String, val nota: Int){


    fun imprimirinfo() {
        println("Nombre: $nombre y tiene una nota de $nota")
    }

    fun mayor4() {
        when {
            nota >= 4 -> println("La nota de $nombre es regular")
            else -> println("La nota de $nombre no es regular")
        }
    }
}

fun main() {
    val alumno1 = Alumno("Arca", 7)
    alumno1.imprimirinfo()
    alumno1.mayor4()
    println("******************************")
    val alumno2 = Alumno("Benito", 2)
    alumno2.imprimirinfo()
    alumno2.mayor4()
}