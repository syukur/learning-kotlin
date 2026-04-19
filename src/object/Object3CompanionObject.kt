package `object`

class BigBen{
    companion object Bonger{
        fun getBonger(nTimes: Int){
            repeat(nTimes) {
                println("BONG")
            }
        }
    }
}

fun main() {
    BigBen.getBonger(5)
}