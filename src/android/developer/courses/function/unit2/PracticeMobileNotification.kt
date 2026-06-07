fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    var notificationMessage: String ="You have $numberOfMessages notifications."

    if (numberOfMessages > 99 )
        notificationMessage =  "Your phone is blowing up! You have 99+ notifications."

    println(notificationMessage)
}