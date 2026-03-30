package variable

fun main() {
    // Read only list
     val readOnlyShapes = listOf("triangle","square","circle")
    // val readOnlyShapes : List<String> = listOf("triangle","square","circle")
    println(readOnlyShapes)

    //looping item List
    println("\nloop List")
    readOnlyShapes.forEach {
        println(it)
    }


    // Mutable list with exlicit type declaration
    val shapes : MutableList<String> = mutableListOf("triangle","square","circle")
    println(shapes)
    shapes.add("hexagonal")
    println(shapes)
}