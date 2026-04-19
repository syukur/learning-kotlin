package `object`

interface Order{
    val orderId: String
    val customerName: String
    val orderTotal: Double
}

data object OrderOne : Order{
    override val orderId = "001"
    override val customerName = "Alice"
    override val orderTotal = 15.50
}

data object OrderTwo : Order{
    override val orderId = "002"
    override val customerName = "Jack"
    override val orderTotal = 14.50
}

fun main() {
    println("Order name: $OrderOne")
    println("Order name: ${OrderTwo}")

    println("Are the two orders identical ? ${OrderOne == OrderTwo}")

    if (OrderTwo == OrderOne)
        println("The order are identical")
    else
        println("The order are unique")

    println("Do the orders have the same customer name? ${OrderOne.customerName == OrderTwo.customerName}")
}