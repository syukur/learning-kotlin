package nullsafety

import org.jetbrains.annotations.NotNull

fun main() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Error: by default a variable is non-nullable
    // Throws a compiler error
    //neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    // This is OK
    nullable = null
    println("nullable: $nullable")

    var inferredNonNull = "The compiler assumes non-nullable";

    //Throws a compiler error
    //inferredNonNull = null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int{
        return notNull.length
    }

    println(strLength(neverNull))

    /// Throws a compiler error
    //println(strLength(nullable))
}