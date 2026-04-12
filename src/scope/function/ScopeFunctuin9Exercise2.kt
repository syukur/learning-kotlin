package scope.function

data class User(val id: Int, var email: String)

fun updateEmail(user: User, newEmail: String) : User = user.apply {
    email = newEmail
    println("Updated email to ${newEmail}")
}.also {
    println("Updated email for user with id ${it.id} and email ${newEmail}")
}

fun main() {
    val user = User(1, "old_email@gmail.com")
    val updatedUser = updateEmail(user, "new_email@gmail.com")
    println("Updated User: $updatedUser")
}