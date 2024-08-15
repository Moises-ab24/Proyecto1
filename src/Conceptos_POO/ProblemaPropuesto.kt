package Conceptos_POO

/*
Implementar una clase llamada Alumno que tenga como propiedades su
nombre y su nota. Definir los métodos para inicializar sus propiedades por
teclado, imprimirlos y mostrar un mensaje si está regular (nota mayor o igual a 4)
Definir dos objetos de la clase Alumno
 */

class Alumno {
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar() {
        print("Ingrese el nombre:")
        nombre = readln()
        print("Ingrese la nota:")
        nota = readln().toInt()
    }

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
    val alumno1 = Alumno()
    alumno1.inicializar()
    alumno1.imprimirinfo()
    alumno1.mayor4()
    println("******************************")
    val alumno2 = Alumno()
    alumno2.inicializar()
    alumno2.imprimirinfo()
    alumno2.mayor4()
}