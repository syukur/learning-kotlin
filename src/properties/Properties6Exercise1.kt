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



fun main() {
    val inventory = listOf(3, 0, 7, 0, 5)
    println(findOutOfStockBooks(inventory))
}