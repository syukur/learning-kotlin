package function

import kotlin.math.PI

//Circle Area in single-expression
fun circleArea2(radius : Int) : Double = PI * radius * radius

fun main() {
    println(circleArea2(radius = 2))
}
