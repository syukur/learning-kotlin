package intermediate.nullsafety

fun calculateTotalStringLength(items: List<Any>): Int {
    return items.sumOf { (it as? String)?.length ?: 0  }
}

fun main() {
    val list = listOf("Syukur","Kurnia")
    println(calculateTotalStringLength(list))

    val list2 = listOf(1, 2, 3)
    println(calculateTotalStringLength(list2))
}