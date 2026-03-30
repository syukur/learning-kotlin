package variable

fun main() {
    // Read only list
     val readOnlyShapes = listOf("triangle","square","circle")
    // val readOnlyShapes : List<String> = listOf("triangle","square","circle")
    println(readOnlyShapes)


    // Mutable list with exlicit type declaration
    val shapes : MutableList<String> = mutableListOf("triangle","square","circle")
    println(shapes)
}