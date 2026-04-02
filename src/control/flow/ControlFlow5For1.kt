package control.flow

fun main() {
    // Example 1: Basic For
    println("Example 1: Basic For")
    for (number in 1..5)
        println(number)

    // Example 2: Collection iteration
    println("Example 2: Collection iteration")
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes)
        println("Yummy, is's a $cake cake!")

}