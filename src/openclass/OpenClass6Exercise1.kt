package openclass

sealed class DeliveryStatus(){
    data class Pending(val sender: String) : DeliveryStatus()
    data class InTransit(val estimatedDeliveryDate: String) : DeliveryStatus()
    data class Delivered(val deliveryDate: String, val recipient: String) : DeliveryStatus()
    data class Cancelled(val reason: String) : DeliveryStatus()
}

fun printDeliveryStatus(status: DeliveryStatus){
    when (status) {

        is DeliveryStatus.Pending -> {
            println("The package is pending from ${status.sender}.")
        }

        is DeliveryStatus.InTransit -> {
            println("The package is in transit and executed ot arrive by ${status.estimatedDeliveryDate}.")
        }

        is DeliveryStatus.Delivered -> {
            println("The package was delivered to ${status.recipient} on ${status.deliveryDate}.")
        }

        is DeliveryStatus.Cancelled -> {
            println("The package was cancelled due to: ${status.reason}.")
        }
    }
}

fun main() {
    val status1 = DeliveryStatus.Pending("Daniel")
    val status2 = DeliveryStatus.InTransit("2026-04-12")
    val status3 = DeliveryStatus.Delivered("2026-04-13", "Jon Wick")
    val status4 = DeliveryStatus.Cancelled("Address not found")

    printDeliveryStatus(status1)
    printDeliveryStatus(status2)
    printDeliveryStatus(status3)
    printDeliveryStatus(status4)

}