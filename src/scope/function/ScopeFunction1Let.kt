package scope.function

fun sendNotification(recipientAddress: String): String {
    println("Yo $recipientAddress")
    return "Notification sent!"
}

fun getNextAddress(): String {
    return "sebastian@jetbrain.com"
    //return null
}

fun main() {
    val address: String? = getNextAddress()
    val confirm = address?.let {
        sendNotification(it)
    }
}
