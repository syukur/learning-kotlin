package android.developer.courses.function.unit2

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Long,
    ) {

    var isPopular: Boolean = false
        get() = playCount >= 1000

    var description =""
        get() = "[$title], performed by [$artist], was release in [$yearPublished], popular: [$isPopular]"
}

fun main() {
    var song1 = Song(
        title = "Menghapus jejakmu",
        artist = "Noah",
        yearPublished = 2019,
        playCount = 1500
    )

    println(song1.description)
}