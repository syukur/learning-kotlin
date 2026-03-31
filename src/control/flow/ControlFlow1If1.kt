package control.flow

fun main() {
    // Example 1 : basic If

    val d : Int
    val check : Boolean = true

    if (check){
        d = 1
    }else{
        d = 2
    }

    println("example 1 : $d")

    /**
     * Example 2 : no ternary operaton in kotlin (ternary condition ? then : else)
     * but, any optional like this
     */

    val a = 1
    val b = 2

    print("Example 2 : ")
    println(if (a > b) a else b)

}