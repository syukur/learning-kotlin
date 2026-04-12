package lambda.expression.with.receiver

class Canvas {
    fun drawCircle() = println("Drawing Circle")
    fun drawSquared() = println("Drawing Squared")
}

fun render(block: Canvas.() -> Unit): Canvas {
    val canvas = Canvas()
    canvas.block()
    return canvas
}

fun main() {
     render {
        drawCircle()
        drawSquared()
    }

}