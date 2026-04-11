package scope.function

/**
 * Objective :
 * menghitung banyak karakter a dalam sebuat sting
 * let use as scope
 */

fun main() {
    val name = "Sabrina Carpenter"

    val countChar_a = name.let {
        var count = 0

        it.toCharArray().forEach { char ->
            if (char == 'a') count++
        }

        count
    }

    println("Jumlah Karakter 'a' didalam text '$name', adalah $countChar_a")
}