package function

import kotlin.math.log

val listNumber = listOf(1,2,3,4,5)

fun map ( tranform : (Int) -> Int) : List<Int> {
   val result = mutableListOf<Int>()
   for ( number in listNumber )
      result.add(tranform(number))

    return result

}

fun fold ( calculate : (Int) -> Int ) : Int{

    var result : Int = 0
    for (number in listNumber) {
        println("result_1 $result" )
        result = calculate(number)
        println("result_3 $result" )

    }
    return result
}

fun main() {
    val mapped = map { number -> number * 2 }
    println("listNumber: $listNumber")
    println("mapped: $mapped")

    println(fold { number -> number + number })
}