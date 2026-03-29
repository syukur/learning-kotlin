package variable

fun main() {

    /**
     * val : for declare read only variables ( contants ?)
     * var : for declare mutable variables (variable yang bisa berubah)
     */

    val popcorn = 5 // There are 5 boxes of popcorn
    val hotdog = 7 // There are 7 hotdogs
    var customer = 10 // There are 10 customer in the queue

    // Some customer leave the queue
    customer = 8

    print(customer)

    // this code will be error, because val can't reassigned
   // popcorn = 10
}