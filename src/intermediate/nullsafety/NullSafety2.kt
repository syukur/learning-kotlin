package intermediate.nullsafety

fun main() {
    val a: String? = null

    //val b = a as String // Triggers an error at runtime
    val b = a as? String
    println(b)
}