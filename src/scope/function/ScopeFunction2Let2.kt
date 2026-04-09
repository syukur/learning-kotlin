package scope.function

/**
 * let
 */

fun main() {

    val name: String? = "Budi"

    name?.let {
        println("nilai variable name: $name ")
    }

}