package `class`.and.inteface

class Car(val make: String, val model: String, val numberOfDoors: Int)

fun main() {
    val car1 = Car(
        make = "Daihatsu",
        model = "Sirion",
        numberOfDoors = 4
    )

    println("Car1 make: ${car1.make}, model: ${car1.model}, numberOfDoors: ${car1.numberOfDoors}")
    println(car1)
    println(car1.toString())
}