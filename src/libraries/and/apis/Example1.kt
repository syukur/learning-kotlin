package libraries.and.apis

import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

fun main() {
    val thirtyMinutes: Duration = 30.minutes
    val halfHours: Duration = 0.5.hours

    println(thirtyMinutes == halfHours)
    println(thirtyMinutes)
    println(halfHours)
}