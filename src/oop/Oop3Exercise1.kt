package oop

data class Employee(
    val name: String,
    var salary: Int
)

fun main() {
    val employee = Employee("Dmitry", 25)
    println(employee)

    // Salary Increase
    employee.salary += 25
    println(employee)
}