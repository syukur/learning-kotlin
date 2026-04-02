package control.flow

fun main() {

    // Example 1: Basic while
    println("Example 1: Basic while")
    println("----------------------")
    var cakesEaten = 0

    while (cakesEaten < 3) {
        println("eat a cake")
        cakesEaten++
    }

    // Example 2: do-while
    println("\nExample 2: do-while")
    println("----------------------")
    var cakesbacked = 0

    do{
        println("Bake a cake")
        cakesbacked++
    } while (cakesbacked < 3)



}