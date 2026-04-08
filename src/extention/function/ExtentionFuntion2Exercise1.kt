package extention.function

/**
 * objective :
 * create extention function of Int type
 * to check an integer is positive,
 * return: boolean
 */

fun Int.isPositive() = this > 0

fun main() {
    val number: Int = -1
    println(number.isPositive())
}