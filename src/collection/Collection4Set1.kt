package collection

import kotlin.system.exitProcess

fun main() {

    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    // Mutable set with explisit type declaration
    val fruit : MutableSet<String> = mutableSetOf<String>("apple", "banana", "cherry", "cherry")

    // print read-only set, cherry print just ones
    // because set cannot add duplicate value
    println(fruit)

    // Set are unordered, we can't access as item at a particula index
    //println(fruit[0])

    /// get number of Set item
    println("This set has ${readOnlyFruit.count()} items")

    // cek an item is in the Set
    println("\"banana\" is exist in the Set: ${"banana" in fruit}")

    // add item to the set
    fruit.add("dragonfruit")
    println(fruit)

    fruit.remove("dragonfruit")
    println(fruit)
}