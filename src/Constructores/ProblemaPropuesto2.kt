package Constructores

/*
Cofeccionar una clase que represente un punto en el plano, la coordenada de
un punto en el plano está dado por dos valores enteros x e y.
Al constructor llega la ubicación del punto en x e y.
Implementar un método que retorne un String que indique en que cuadrante
se ubica dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y >
0, 3º Cuadrante: x < 0 Y y < 0, 4º Cuadrante: x > 0 Y y < 0)
Si alguno o los dos valores son cero luego el punto se encuentra en un eje.
Definir luego 5 objetos de la clase Punto en cada uno de los cuadrantes y uno
en un eje.
 */

class coordenada constructor(val x :Int, val y: Int) {
    fun cuadrante() =
        when {
            x > 0 && y > 0 -> println("Primer cuadrante")
            x < 0 && y > 0 -> println("Segundo cuadrante")
            x < 0 && y < 0 -> println("Tercer cuadrante")
            x > 0 && y < 0 -> println("Cuarto cuadrante")
            else -> println("En un eje")
        }
}

fun main() {
    val coord1 = coordenada(1,1)
    print("La coordenada con eje x: ${coord1.x}" + " y con eje y: " + " ${coord1.y} Se encuetra: ")
    coord1.cuadrante()
    println("*******************************************")
    val coord2 = coordenada(-1,1)
    print("La coordenada con eje x: ${coord2.x}" + " y con eje y: " + " ${coord2.y} Se encuetra: ")
    coord2.cuadrante()
    println("*******************************************")
    val coord3 = coordenada(-1,-1)
    print("La coordenada con eje x: ${coord3.x}" + " y con eje y: " + " ${coord3.y} Se encuetra: ")
    coord3.cuadrante()
    println("*******************************************")
    val coord4 = coordenada(1,-1)
    print("La coordenada con eje x: ${coord4.x}" + " y con eje y: " + " ${coord4.y} Se encuetra: ")
    coord4.cuadrante()
    println("*******************************************")
    val coord5 = coordenada(0,0)
    print("La coordenada con eje x: ${coord5.x}" + " y con eje y: " + " ${coord5.y} Se encuetra: ")
    coord5.cuadrante()
}