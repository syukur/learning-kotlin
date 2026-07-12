package android.developer.courses.unit3.collection

fun main() {
    val rockPlanet = arrayOf<String>("Mercury","Venus","Earth","Mars")
    val gasPlanet = arrayOf("Jupiter","Saturn","Uranus","Neptune")

    val solarSystem = rockPlanet + gasPlanet

    solarSystem.forEach { println(it) }
}