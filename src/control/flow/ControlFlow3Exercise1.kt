package control.flow

import kotlin.random.Random

// Exercise 1
fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)


    println("first result: $firstResult, second result: $secondResult")

    if (firstResult == secondResult)
        println("You win :)")
    else
        println("You lose :(")
}