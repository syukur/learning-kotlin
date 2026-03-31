package collection

import kotlin.math.max

fun main() {

    // Read-only map
    val readOnyJuiceMenu = mapOf(
        "apple" to 100,
        "kiwi" to 190,
        "orange" to 100
    )
    println(readOnyJuiceMenu)

    // Mutable map with explicit type declaration
    val juiceMenus : MutableMap<String, Int> = mutableMapOf(
        "apple" to 100,
        "kiwi" to 190,
        "orange" to 100
    )
    println("MutableMap: $juiceMenus")

    // casting mutable map to Read-only map
    val juiceMenuLocked : Map<String, Int> = juiceMenus
    println(juiceMenuLocked)

    // access value of map
    println("The price of apple juice is ${juiceMenus["apple"]}")

    /** if we try to access key-value pair with  a key
     * then doesn't exist in map, you sell a null value
     */
    println("The price of pineapple is ${juiceMenus["pineapple"]}")

    // add map item, with incex
    juiceMenus["coconut"] = 150
    println("MutableMap after add coconut: $juiceMenus")

    // remove map item
    juiceMenus.remove("orange")
    println("MutableMap after remove \"orange\" $juiceMenus")

    // get the number of items in a map
    println("This map has ${readOnyJuiceMenu.count()} key-value pairs")

    // check contain key
    println("This map has key \"kiwi\" : ${readOnyJuiceMenu.containsKey("kiwi")}" )

    println("collection of keys: ${readOnyJuiceMenu.keys}")

    println("collection of  values: ${readOnyJuiceMenu.values}")

    // check a key is in the map
    println("orange" in readOnyJuiceMenu.keys)

    // Alternatively, you don't need to use the keys property
    println("orange" in readOnyJuiceMenu)

    // check a value is in the map
    println(200 in readOnyJuiceMenu.values)

}