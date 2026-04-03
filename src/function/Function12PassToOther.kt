package function

fun main() {

    // Basic Lambda
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter({ x -> x > 0})
    val isNegative = {x : Int-> x < 0}
    val negative = numbers.filter (isNegative)

    println("numbers $numbers")
    println("positives : $positives" )
    println("negative : $negative")

    // Trailing Lambda -> drop the parentheses ()
    val doubled = numbers.map{ x -> x * 2 }

    val isTripled = {x:Int -> x * 3}
    val tripled = numbers.map(isTripled)

    println("doubled : $doubled" )
    println("tripled : $tripled")
}