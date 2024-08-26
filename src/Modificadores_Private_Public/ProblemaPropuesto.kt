package Modificadores_Private_Public

/*
Desarrollar una clase que defina una propiedad privada de tipo arreglo de 5
enteros. En el bloque init llamar a un método privado que cargue valores
aleatorios comprendidos entre 0 y 10.
Definir otros tres métodos públicos que muestren el arreglo, el mayor y el menor elemento.
 */

class clase {
    private val arre = IntArray(5)
    init {
        cargar()
    }

    private fun cargar() {
        for(i in arre.indices)
            arre[i] = ((Math.random() * 11)).toInt()
    }

    fun imprimir() {
        println("Lista del arreglo")
        for(i in arre.indices)
            println("-${arre[i]}")
    }

    fun mayor() {
        var mayor = arre[0]
        for(i in arre.indices)
            if (arre[i] > mayor)
                mayor = arre[i]
        println("El mayor del arreglo es $mayor")
    }

    fun menor() {
        var menor = arre[0]
        for(i in arre.indices)
            if (arre[i] < menor)
                menor = arre[i]
        println("El menor del arreglo es $menor")
    }
}

fun main(parametro: Array<String>) {
    val vector1 = clase()
    vector1.imprimir()
    vector1.mayor()
    vector1.menor()
}