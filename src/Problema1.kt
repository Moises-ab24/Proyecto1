fun main(){
    println("asdf")
    /*
    Crear un programa que defina dos variables inmutables de tipo Int. Luego definir una
    tercer variable mutable que almacene la suma de las dos primeras variables y las
    muestre. Seguidamente almacenar en la variable el producto de las dos primeras
    variables y mostrar el resultado.
     */
    val valor1: Int
    valor1= 100
    val valor2: Int
    valor2= 200
    var resultado: Int
    resultado= valor1 + valor2
    println("La suma de $valor1 + $valor2 es $resultado")
    resultado= valor1 * valor2
    println("El producto de $valor1 * $valor2 es $resultado")
}