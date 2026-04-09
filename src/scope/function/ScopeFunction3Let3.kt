package scope.function

/**
 * let as chaining
 */

fun main() {
    val number = 2
    val result = number
        .let { it * 2 }
        .let { it * 10}

    println(result)
}