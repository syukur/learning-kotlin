package `class`.and.inteface

import function.upperCaseString2
import jdk.internal.joptsimple.internal.Messages.message

interface Messenger{
    fun sendMessage(message: String)
    fun receiveMessage(): String
}

class BasicMessenger(): Messenger {
    override fun sendMessage(message: String) = println("Sending message: $message")
    override fun receiveMessage(): String= "You got a mew message!"
}

class SmartMessenger(val basicMessenger: BasicMessenger): Messenger by basicMessenger{
    override fun sendMessage(message: String) {
        println("Sending a smart message: $message")
        basicMessenger.sendMessage("[smart] $message")
    }
}

fun main() {
    val basicMessenger = BasicMessenger()
    val smartMessenger = SmartMessenger(basicMessenger)

    basicMessenger.sendMessage("Hello!")
    println(smartMessenger.receiveMessage())
    smartMessenger.sendMessage("Hello from SmartMessenger!")
}