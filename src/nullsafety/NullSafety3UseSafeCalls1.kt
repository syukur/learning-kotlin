package nullsafety

fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    val nullString: String? = null
    println(lengthString(nullString))

    val nullString2: String? = null
    println(nullString2?.length)
}