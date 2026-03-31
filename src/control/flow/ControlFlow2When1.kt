package control.flow

fun main() {

    //  Example 1
    val obj = "Hello"

    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }
}