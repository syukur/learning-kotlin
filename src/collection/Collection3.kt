package collection

fun main() {
    val readOnlyShape = listOf("triangle", "square", "circle")

    // get first List item with index
    println("The fist item in the list is: ${readOnlyShape[0]}")

    // get first List item with method
    println("The fist item in the list is: ${readOnlyShape.first()}")

    // get total member of list
    println("This List has ${readOnlyShape.count()} item")

    // cek an item is in the list
    println("circle" in readOnlyShape)
    println("circle is in the list: ${"circle" in readOnlyShape}")
    println("trapezoid is in the list: ${"trapezoid" in readOnlyShape}")

    // add & remove MutableList
    val shape: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println("List of shape before add \"pentagon\" : $shape")

    shape.add("pentagon")
    println("List of shape after add \"pentagon\" : $shape")

    shape.remove("pentagon")
    println("List of shape after remove \"pentagon\" : $shape")

    // List allow add duplicate item
    shape.add("triangle")
    println("List of shape after add \"triangle\" : $shape")
}