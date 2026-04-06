package nullsafety


fun main() {
    val nullString2: String? = null
    println(nullString2?.length ?: 0)
}