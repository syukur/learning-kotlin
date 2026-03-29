package variable

fun main() {
    val customer = 10
    println("There are $customer customers")
    // There are 10 customer

    println("There are ${customer + 1} class customers")
    //There are 11 customer

    println("Latest customer value : $customer")
}