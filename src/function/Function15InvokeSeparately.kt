package function

/**
 * Invoke separately
 * lambda dapat di jalankan langsung saat expression di definikan
 */

fun main() {
    println({text : String -> text.uppercase()} ("ibrahim"))
}