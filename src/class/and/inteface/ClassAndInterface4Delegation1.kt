package `class`.and.inteface

interface DrawingTool{
    val color: String
    fun draw(shape: String)
    fun erase(area: String)
}

class Pentool() : DrawingTool {
    override val color = "black"

    override fun draw(shape: String) {
        println("Drawing $shape using the $color")
    }

    override fun erase(area: String) {
        println("Erasing $area with pentool")
    }
}

class CanvasSession(val pentool: Pentool): DrawingTool{
    override val color = "blue"

    override fun draw(shape: String) {
        pentool.draw(shape)
    }

    override fun erase(area: String) {
        pentool.erase(area)
    }
}

fun main() {
    val pentool = Pentool()
    val session = CanvasSession(pentool)

    println("Pen color: ${pentool.color}")

    println("Session color: ${session.color}")

    session.draw("Circle")

    session.erase("top-left corner")

    println(session.color)
}