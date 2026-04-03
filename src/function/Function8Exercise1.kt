package function

import kotlin.math.PI

// Circle Area
fun circleArea(radius : Int) : Double {
    return PI * radius * radius
}

fun main() {
    println(circleArea(radius = 2))
}