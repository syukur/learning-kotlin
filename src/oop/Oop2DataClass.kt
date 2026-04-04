package oop

data class User(
    val name : String,
    val id : Int
)

fun main() {
    val user = User("Ibrahim", 1)

    //1.  Print object as String
    println(user.toString())
    //output: User(name=Ibrahim, id=1)

    println(user)
    //output: User(name=Ibrahim, id=1)

    val firstUser = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 1)

    //2. Compare Object
    println("\nfirstUser == secondUser : ${firstUser == secondUser}")
    println("firstUser == secondUser : ${firstUser.equals(secondUser)}")
    println("firstUser == thirdUser  : ${firstUser == thirdUser}")
    println("firstUser == thirdUser : ${firstUser.equals(thirdUser)}")

    // 3. Copy Object

    val  userAlex = User("Alex", 1)
    println("\nuserAlex : ${userAlex}")

    val userMax = userAlex.copy("Max")
    println("userMax : ${userMax}")

    val userAlex2 = userAlex.copy(id = 3)
    println("userAlex2 : ${userAlex2}")
}