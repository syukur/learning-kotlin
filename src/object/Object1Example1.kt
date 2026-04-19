package `object`

object DoAuth{
    fun takeParams(username: String, password: String) = println("$username:$password")
    var name ="Jon"
}

fun main() {
    DoAuth.takeParams("coding_ninja", "NinjaC0ding")
    DoAuth.name="Brandy"
    DoAuth.takeParams("sabrina","5@brina")
    println(DoAuth.name)
}