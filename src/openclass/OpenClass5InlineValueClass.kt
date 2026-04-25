package openclass

@JvmInline
value class Email( val address : String )

fun sendEmailTo(email: Email) {
    println("sending to ${email.address}")
}

fun main() {
    val email = Email("somewhere.com")
    sendEmailTo(email)
}