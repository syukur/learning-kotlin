package function

fun printMessageWithPrefix1(message: String , prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {

    // Function called with both parameters
    printMessageWithPrefix1("Hello", "Log")

    // Function called only eit message parameter
    printMessageWithPrefix1("Helo")

    printMessageWithPrefix1(prefix = "Log", message = "Hello")
}