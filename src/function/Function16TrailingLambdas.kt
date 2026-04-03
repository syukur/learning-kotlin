package function

fun main() {
    // Basic Lambda Use
    println(listOf(1,2,3).fold(0, {x, item -> x + item}))

    // Trailing Lambda Use
    println(listOf(1,2,3).fold(0) {x,y -> x + y}  )

}
