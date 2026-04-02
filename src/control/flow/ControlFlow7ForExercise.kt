package control.flow

fun main() {

    println("Exercise 1 : Fizz buzz")
    for ( number in 1..100) {

        val value = when  {
            number % 15 == 0 -> "fizzbuzz"
            number % 3 == 0 -> "fizz"
            number % 5 == 0 -> "buzz"
            else -> number.toString()
        }

        println(value)
    }


}
