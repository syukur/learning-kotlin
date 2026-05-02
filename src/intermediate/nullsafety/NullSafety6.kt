package intermediate.nullsafety

fun main() {
    // Temperatures recorded over a week
    val temperature = listOf(15, 18, 21, 21, 19, 17, 16)
    //val temperature: List<String>? = null

    // Find the highest temperature of the week
    val maxTemperature = temperature?.maxOrNull()
    println("Highest temperature recorded: ${maxTemperature ?: "No data"}")
    // Find the highest temperature of the week

    // Find the highest temperature of the week
    val minTemperature = temperature?.minOrNull()
    println("Minimum temperature recorded: ${minTemperature ?: "No data"}")
    // Find the highest temperature of the week

    // Check if there was exactly one day with 30 degrees
    val hotDegrees = 30
    val singleHtDay = temperature.singleOrNull{ it == hotDegrees}
    println("Single hot day with $hotDegrees degress: ${singleHtDay ?: "None"}")
    // Single hot day with 30 degrees: None

    data class User(
        val name: String?,
        val age: Int?
    )

    val users = listOf(
        User(null, age = 25),
        User("Alice", age = null),
        User("Bob", age = 30)
    )

    val fistNotNullName = users.firstNotNullOfOrNull { it.name }
    println(fistNotNullName)
    //Alice

    // Prices of items in a shopping cart
    val itemPrices = listOf(20, 35, 15, 40, 10)

    // Calculate the total price using the reduceOrNull() function
    val totalPrice = itemPrices.reduceOrNull { runningTotal, price -> runningTotal + price }
    println("Total price of items in the cart: ${totalPrice ?: "No items"}")
    // Total price of items in the cart: 120

    val emptyCart = listOf<Int>()
    val emptyTotalPrice = emptyCart.reduceOrNull { runningTotal, price -> runningTotal + price }
    println("Total price of items in the empty cart: ${emptyTotalPrice ?: "No items"}")
    // Total price of items in the empty cart: No items

}