package `object`

interface Vehicle{
    val name: String
    fun move(): String
}

object FlyingSkateboard : Vehicle{
    override val name: String = "Flying Skateboard"
    override fun move(): String = "Glides through the air with a hover engine"
    fun fly (): String = "Woooooooo"
}

fun main() {
    println("${FlyingSkateboard.name} : ${FlyingSkateboard.move()}")
    println("${FlyingSkateboard.name} : ${FlyingSkateboard.fly()}")
}