package properties

// function sesuai request soal
fun findOutOfStockBooks(inventory: List<Int>): List<Int> {
   return buildList {
        for (i in inventory.indices){
           if(inventory[i] < 1)
               add(i)
        }
    }

}

// real life harusnya gini, lebih pendek
fun findOutOfStockBooks1(inventory: List<Int>): List<Int> {
    return inventory.filter { it < 1 }
}

fun main() {
    val inventory = listOf(3, 0, 7, 0, 5)
    println(findOutOfStockBooks(inventory))

    val inventory2 = listOf(3, 0, 7, 0, 5)
    println(findOutOfStockBooks(inventory2))
}