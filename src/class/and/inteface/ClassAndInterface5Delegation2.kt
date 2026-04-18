package `class`.and.inteface

interface DrawingTool1{
    val color: String
    fun draw(shape: String)
    fun erase(area: String)
}

class Pentool1() : DrawingTool1 {
    override val color = "black"

    override fun draw(shape: String) {
        println("Drawing $shape using the $color")
    }

    override fun erase(area: String) {
        println("Erasing $area with pentool")
    }
}

class CanvasSession1(val pentool: DrawingTool1): DrawingTool1 by pentool{
    override val color = "blue"
}

fun main() {
    val pentool = Pentool1()
    val session = CanvasSession1(pentool)

    println("Pen color: ${pentool.color}")

    println("Session color: ${session.color}")

    session.draw("Circle")

    session.erase("top-left corner")

    println(session.color)
}