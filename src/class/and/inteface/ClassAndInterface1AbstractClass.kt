package `class`.and.inteface

abstract class Product(
    val name: String,
    val price: Double
){
    // Abstract property for the product category
    abstract val category: String

    // A Function that can be share by all product
    fun productInfo():String{
        return "Product: $name, Category: $category, Price: $price"
    }

}

class Electronic(name: String, price: Double, val warranty: Int): Product(name, price){
    override val category = "Electronic"
}

class Vehicle(name: String, price: Double, val warranty: Int): Product(name, price){
    override val category = "Vehicle"
}

fun main() {
    // Create an instance of the Electronic class
    val laptop = Electronic(
        name = "Laptop",
        price = 1000.0,
        warranty = 2
    )

    val motorCycle = Vehicle(
        name = "motorcycle",
        price = 1000.0,
        warranty = 2
    )


    println(laptop.productInfo())
    // Product: Laptop, Category: Electronic, Price: 1000.0

    println(motorCycle.productInfo())
}