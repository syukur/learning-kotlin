package android.developer.courses.unit3.collection

fun main() {

    // LIST
    val solarSystem = listOf("Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune")

    // get size of list
    println(solarSystem.size)

    // access element using subscript syntax
    println(solarSystem[2])

    // access element by calling get()
    println(solarSystem.get(3))

    // get index by member value
    println(solarSystem.indexOf("Earth"))

    // get index by member value, but member not exist, will return -1
    println(solarSystem.indexOf("Pluto"))

    // iterate list
    for (planet in solarSystem)
        println(planet)


    // MUTABLE_LIST

    val mutableSolarSystem = mutableListOf("Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune")

    // add new element
    mutableSolarSystem.add("Pluto")

    // add new element, with index, index ke tiga original dan index di bawah lainnya akan bergeser ke bawah
    mutableSolarSystem.add(3, "Theia")

    println("-----------")
    for (planet in mutableSolarSystem)
        println(planet)

    // update element value
    mutableSolarSystem[3] = "Future Moon"

    println("-----------")
    for (planet in mutableSolarSystem)
        println(planet)

    // remove by element values
    mutableSolarSystem.remove("Future Moon")
    println("after remove-----------")
    for (planet in mutableSolarSystem)
        println(planet)

    // cek existensi dengan contain
    println(mutableSolarSystem.contains("Pluto"))

    // cek existensi dengan in
    println("Future Moon" in mutableSolarSystem)
}
