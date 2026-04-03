package function

/**
 * menthod toSecond me-return sebuah lambda, dengan satu parameter Int dan return value Int
 * ada 3 kemunkinan return expression yaitu :
 * { value -> value * 60 * 60 } untuk hours
 * { value -> value * 60 } untuk minutes
 * { value -> value } untuk seconds
 * else nya {value -> value}
 */
fun toSeconds(time : String) : (Int) -> Int = when(time){
    "hour" -> { value -> value * 60 * 60 }
    "minutes" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> {value -> value}
}

fun main() {
    val timeInMinutes = listOf(2,10,15,1)
    val minToSec = toSeconds("minutes")
    val totalTimeInSeconds = timeInMinutes.map (minToSec ).sum()
    println("Total time: $totalTimeInSeconds minutes")
}