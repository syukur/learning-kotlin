package oop

class Contact (
    val id: Int,
    var email: String = "example@gmail.com"
){
    val category: String = "Work"

    fun printData(){
        println("id: $id, email: $email, category: $category")
    }
}

fun main() {
    val contact = Contact(1, "sabrina@gmail.com")

    println("id: ${contact.id}, email: ${contact.email}, category: ${contact.category}")

    // Error: val cannot reasigned
    //contact.category = "Personal"

    contact.email  = "carpenter@gmail.com"
    contact.printData()
}