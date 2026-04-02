package control.flow

fun main() {

    println("while:")
    println("-------")
    var pizzaSlice = 0
    while (pizzaSlice < 7) {
        pizzaSlice++
        println("There's only $pizzaSlice slice/s of pizza :(")
    }

    pizzaSlice++
    println("There are $pizzaSlice slice/s of pizza. Hooray! we have a whole pizza! :) ")

    println("\ndo-while:")
    println("-------")
    pizzaSlice = 0
    do {
        pizzaSlice++
        println("There's only $pizzaSlice slice/s of pizza :(")
    }while (pizzaSlice < 7)
    pizzaSlice++
    println("There are $pizzaSlice slice/s of pizza. Hooray! we have a whole pizza! :) ")
}