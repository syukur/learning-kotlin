package nullsafety

fun describeString(str: String?): String {
    if (str != null && str.length > 0)
        return "String of length ${str.length}"
    else
        return "Empty of null String"


}

fun main() {
    val nullString: String? = null
    println(describeString(nullString))

    val notNullString = "Not null String"
    println(describeString(notNullString))
}