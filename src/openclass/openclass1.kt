package openclass

import `class`.and.inteface.PaymentType

interface EcoFriendly{
    val emissionLevel: String
}

interface ElectronicVehicle{
    val batteryCapacity: Double
}

open class Vehicle(
    val make: String,
    val model: String,
    val transmisionType: String = "Manual"
){
    open fun displayInfo() = println("Vehicle Info: Make - $make, Model - $model")
}

open class Car (make: String, model: String, var numberOfDoors: Int): Vehicle(make, model,"Automatic"){
    override fun displayInfo() = println("Car Info: Make - $make, Model - $model, Number of Doors - $numberOfDoors")
}

class ElectoronicCar(
    make: String,
    model: String,
    numberOfDoors: Int,
    val capacity: Double,
    val emission: String,
    ): Car(make, model, numberOfDoors),EcoFriendly,ElectronicVehicle{

    override val batteryCapacity: Double = capacity
    override val emissionLevel: String = emission
}

fun main() {
    val car1 = Car(
        make = "Toyota",
        model = "Corolla",
        numberOfDoors = 4
    )

    val car2 = Car(
        make = "Honda",
        model = "Civic",
        numberOfDoors = 2
    )

    car1.displayInfo()
    car2.displayInfo()

}