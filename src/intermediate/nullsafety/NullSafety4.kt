package intermediate.nullsafety

fun main() {
    val emails = listOf("alice@example.com", null, "bob@example.com",null, "carol@example.com")
    val validEmails = emails.filterNotNull()
    println(validEmails)
    //[alice@example.com, bob@example.com, carol@example.com]
}