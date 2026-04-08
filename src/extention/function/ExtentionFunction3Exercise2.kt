package extention.function

/**
 * objective:
 * create an extention function of String
 * to convert every char in a string to all lowercase
 * return: String (lowercase)
 *
 * objective2:
 * create extention function to count
 * given char
 */


fun String.toLowerCaseString(): String = this.lowercase()

fun String.countChar(char: Char): Int{

    var result: Int = 0

    this.toCharArray().forEach { member ->
        if( member.equals(char) ) result++
    }

    return result
}

fun main() {
    println("Sabrina Carpenter".toLowerCaseString())

    println("Sabrina Carpenter".countChar('e'))
}