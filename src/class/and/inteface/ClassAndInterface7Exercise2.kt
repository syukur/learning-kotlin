package `class`.and.inteface

interface Media{
    val title: String
    fun play()
}

class Audio(override val title:String, val composer : String) : Media{
    override fun play() {
        println("Playing audio: $title, composed by $composer")
    }
}

fun main() {
    val audio = Audio(title = "Alexandria", composer = "Noah")
    audio.play()
}