package collection

fun main() {
    // Exercise 1
    val greenNumber = listOf(1,4,23)
    val redNumber = listOf(17,2)

    val totalCount = greenNumber.size + redNumber.size
    println(totalCount)

    // Exercise 2
    val SUPPORTED = setOf("HTTP","HTTPS","FTP")
    val requested = "smtp"
    //val requested = "HTTPS"
    val isSupported = requested in SUPPORTED
    println("Support for $requested : $isSupported ")

    if (isSupported)
        println("$requested is supported protocol")
    else
        println("$requested is not supported protocol")

    // Exercise 3

    val number2World = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n =  2
    println("$n is spelt as '${number2World[n]}'")

}