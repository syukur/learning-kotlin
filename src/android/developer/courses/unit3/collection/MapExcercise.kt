package android.developer.courses.unit3.collection

fun main() {
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14,
    )

    println("size = ${solarSystem.size}")
    //printMap(solarSystem)
    solarSystem["Pluto"] = 5
    println("size = ${solarSystem.size}")
    //printMap(solarSystem)
    println(solarSystem["Pluto"])
    println(solarSystem["Theia"])
    solarSystem.remove("Pluto")
    println("size = ${solarSystem.size}")
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
}

fun printMap(solarSystem: MutableMap<String, Int>) {
    println("--------------------->>>")
    for ((key, value) in solarSystem)
        println("$key = $value")
    println("--------------------->>>")
}