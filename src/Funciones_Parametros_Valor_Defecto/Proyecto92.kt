package Funciones_Parametros_Valor_Defecto

/*
Confeccionar una función que reciba un String como parámetro y en forma opcional
un segundo String con un caracter. La función debe mostrar el String subrayado con
el caracter que indica el segundo parámetro.
 */

fun tituloSubrayado(titulo: String, caracter: String = "*") {
    println(titulo)
    for (i in 1..titulo.length)
        print(caracter)
    println()
}

fun main() {
    tituloSubrayado("Sistema de Administracion")
    tituloSubrayado("Ventas", "-")
}