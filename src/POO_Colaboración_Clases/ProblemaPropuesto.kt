package POO_Colaboración_Clases

/*
Plantear una clase Club y otra clase Socio.
La clase Socio debe tener los siguientes propiedades: nombre y la antigüedad
en el club (en años).
Al constructor de la clase socio hacer que llegue el nombre y su antigüedad.
La clase Club debe tener como propiedades 3 objetos de la clase Socio.
Definir un método en la clase Club para imprimir el nombre del socio con
mayor antigüedad en el club.
 */

class Socio(val name: String, val antigüedad: Int) {
        fun imprime() {
            println("El socio $name tiene una antigüedad en el club de $antigüedad años")
        }
    }

class Club {
    val socio1 = Socio("Noriel", 16)
    val socio2 = Socio("Baby Rasta", 25)
    val socio3 = Socio("Jon Z", 21)

    fun viejo() {
          socio1.imprime()
          socio2.imprime()
          socio3.imprime()
        print("El socio con mayor antigüedad es: ")
        when {
            socio1.antigüedad > socio2.antigüedad && socio1.antigüedad > socio3.antigüedad -> print(socio1.name)
            socio2.antigüedad > socio1.antigüedad && socio2.antigüedad > socio3.antigüedad -> print(socio2.name)
            else -> print(socio3.name)
        }
    }
}

fun main() {
    val SocioAnt = Club()
    SocioAnt.viejo()

}