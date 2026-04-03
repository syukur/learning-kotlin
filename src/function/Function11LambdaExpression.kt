package function

// Normal Function
fun upperCaseString(text : String) : String {
    return text.uppercase()
}

// Lambda Expression Function in global
val upperCaseString2 = {text: String -> upperCaseString(text.uppercase())}

fun main() {
    println(upperCaseString("Monday"))

    // Lambda Expression Function in local
    val upperCaseString1 = {text : String -> upperCaseString(text)}

    println(upperCaseString1("Sunday"))
    println(upperCaseString1("Thursday"))

    println(upperCaseString2("Friday"))
}