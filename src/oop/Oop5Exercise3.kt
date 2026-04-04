package oop

import kotlin.random.Random


data class Employee1(
    val name: String,
    var salary: Int
)

class RandomEmployeeGenerator(
    var minSalary: Int,
    var maxSalary: Int
) {

    val names = listOf("John", "Mary","Ann", "Paul", "Jack", "Elizabeth")

    fun generateEmployee() =
        Employee1(names.random(), Random.nextInt(minSalary, maxSalary))
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary= 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}