package function


/**
 * uppercase function if declare parameter types and return function types
 */
val upperCase : (String) -> String = { text -> text.uppercase() }

fun main() {
    println(upperCase("january"))
}