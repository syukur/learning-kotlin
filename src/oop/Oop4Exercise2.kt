package oop

data class City(
    val name: String,
    val countryCode: String
)

data class Address(
    val street: String,
    val city: City
)

data class Name(
    val first: String,
    val last: String
)

data class Person(
    val name: Name,
    val address: Address,
    val ownAPet: Boolean = false
)

fun main() {
    val person = Person(
        Name("Dmitry", "Dmitry"),
        Address("Sesame Street 5432", City("Palo Alto", "456")),
        ownAPet = true
    )

    println(person)
}