package extention.function

//fun String.bold() : String {
//    return "<b>$this</b>"
//}

fun String.bold(): String = "<b>$this</b>"

fun main() {
    println("hello".bold())
}