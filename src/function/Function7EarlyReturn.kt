package function

// users : key = user name, value = passwod
var users : MutableMap<String, String> = mutableMapOf(
    "david" to "david@gmail.com",
    "steve" to "steve@gmail.com",
    "sabrina" to "sabrin@gmail.com",
)

fun registerUser(userName : String, email : String) : String{
    if (userName in users.keys)
        return "User $userName already registered!"

    if (email in users.values)
        return "Email $email already registered!"

    users[userName] = email
    return "User $userName registered successfully!"
}

fun showUsers(users : MutableMap<String,String>){
    println("---------------------------------------")
    println(String.format("%-10s | %-20s", "USERNAME", "EMAIL"))
    println("---------------------------------------")

    for (user in users) {
        println(String.format("%-10s | %-20s", user.key, user.value))
    }
    println("---------------------------------------")
}



fun main() {
    showUsers(users)

    println(registerUser("sabrina", "abc@gmai.com"))
    println(registerUser("baron", "steve@gmail.com"))
    println(registerUser("ilyasa", "ilyasa@gmail.com"))

    showUsers(users)
}