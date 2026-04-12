package testing

val upperCaseString = {text: String -> text.uppercase()}

fun upperCaseString2 (text : String): String = text.let { it.uppercase() }

fun main() {
    println(upperCaseString("kisanak"))
    println(upperCaseString2("kisanak2"))

}