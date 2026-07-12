package android.developer.courses.unit3.practice

enum class DayPart(){
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val durationInMinutes: Int
)

var events = listOf<Event>(
    Event(title = "Wake up", description = "Time to get up", dayPart = DayPart.MORNING, durationInMinutes = 0),
    Event(title = "Eat breakfast", dayPart = DayPart.MORNING, durationInMinutes = 15),
    Event(title = "Learn about Kotlin", dayPart = DayPart.AFTERNOON, durationInMinutes = 30),
    Event(title = "Practice Compose", dayPart = DayPart.AFTERNOON, durationInMinutes = 60),
    Event(title = "Watch latest DevBytes video", dayPart = DayPart.AFTERNOON, durationInMinutes = 10),
    Event(title = "Check out latest Android Jetpack library", dayPart = DayPart.EVENING, durationInMinutes = 45)
)

val Event.durationOfEvent: String
    get(){
        if( this.durationInMinutes < 6 )
           return "short"
        else
          return  "long"
    }


fun main() {
    val event = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        dayPart = DayPart.EVENING,
        durationInMinutes = 15
    )
    println(event)

    val shortEventCount = events.filter { it.durationInMinutes < 60 }
        .fold(0) { acc, event -> acc + 1 }

    println("You have $shortEventCount events.")


    events.groupBy { it.dayPart }
        .forEach {
            println("${it.key} : ${it.value.size}")
        }

    println("Last event of the day ${events.last().title}")

    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}