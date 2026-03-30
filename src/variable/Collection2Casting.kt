package variable

fun main() {
    val shape : MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapeLocked : List<String> = shape

    shapeLocked.forEach{ println(it)}
}