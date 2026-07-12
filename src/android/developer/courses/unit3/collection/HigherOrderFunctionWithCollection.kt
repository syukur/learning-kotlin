package android.developer.courses.unit3.collection

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    cookies.forEach {
        println("Menu item: ${it.name}")
    }

    println("MAP----->>>>")
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    fullMenu.forEach { println(it) }

    println("\nFILTER----->>>>")

    val softBakedMenu = cookies.filter {
        it.softBaked
    }

    for (item in softBakedMenu)
        println("${item.name} - $${item.price}, softbacked: ${item.softBaked}")

    println("\nGROUP BY----->>>>")
    val groupedMenu = cookies.groupBy {it.softBaked}
    val softBakedCookies = groupedMenu[true] ?: listOf()
    val crunchyCookies = groupedMenu[false] ?: listOf()

    println("Soft cookies:")
    softBakedCookies.forEach {
        println("${it.name} -$ ${it.price}")
    }

    println("Crunchy cookies:")
    crunchyCookies.forEach {
        println("${it.name} -$ ${it.price}")
    }

    println("\nFOLD----->>>>")
    val totalPrice = cookies.fold(0.0){
        total, cookie -> total + cookie.price
    }
    println("Total price = $totalPrice")

    println("\nsortedBy()----->>>>")
    val alphabeticalMenu = cookies.sortedBy { it.name }

    alphabeticalMenu.forEach {
        println("${it.name} -$ ${it.price}")
    }
}
