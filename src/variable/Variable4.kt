package variable

fun main() {
    var customer = 10

    // some custome leave the queue
    customer = 8
    customer = customer + 3 // Example of additonal: 11
    customer += 7           // Example of additonal: 18
    customer -= 3           // Example of substraction: 15
    customer *= 2           // Example of multiplication: 30
    customer /= 3           // Example of division: 10

    println(customer) // 10
}