package openclass

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containRed(): Boolean = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    val red = Color.RED
    println(red.containRed())

    println(Color.BLUE.containRed())

    println(Color.YELLOW.containRed())

    println(Color.GREEN.containRed())
}