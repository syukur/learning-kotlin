package nullsafety

data class Employee(
    val name: String,
    val salary: Int
)

fun getEmployeeById(id : Int)= when (id) {
    1 -> Employee("Marry",20)
    2 -> null
    3 -> Employee("John",22)
    4 -> Employee("Ann",23)
    else -> null
}

fun salaryById(id : Int) = getEmployeeById(id)?.salary ?: 0

fun main() {
    println((1..5).sumOf { id -> salaryById(id) })

    for (idx in 1..5){
        val employee = getEmployeeById(idx)
        println(employee.toString())
    }
}