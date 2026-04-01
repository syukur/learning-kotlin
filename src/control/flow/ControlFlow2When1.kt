package control.flow

fun main() {

    //  Example 1 : Basic When
    val obj = "Hello"

    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }


    // Example 2 : When as expression
    val result = when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }

    println("result: $result")

    /** Example 3 :
     * When as an expression,
     * When without subject
      */

    val trafficLightState = "Yellow"

    val trafficAction = when {
            trafficLightState == "Green" -> "Go"
            trafficLightState == "Yellow" -> "Slow down"
            trafficLightState == "Red" -> "Stop"
            else -> "Malfunction"
    }

    println("trafficAction: $trafficAction")
}