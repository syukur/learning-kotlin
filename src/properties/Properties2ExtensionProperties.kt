package properties

data class Human(val firstName: String, val lastName: String)

val Human.fullName: String
    get() ="$firstName $lastName"

fun main() {
    val human = Human("John", "Doe")
    println(human.fullName)
}