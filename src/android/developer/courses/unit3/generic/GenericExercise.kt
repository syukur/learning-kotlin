package android.developer.courses.unit3.generic

/*
class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)

class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)
*/

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}

object StudentProgress

fun main() {
    val question1 = Question<String>(
        questionText = "Berakit-rakit ke ___ , berenang-renang ke tepian",
        answer = "hulu",
        difficulty = Difficulty.EASY
    )

    val question2 = Question<Boolean>(
        questionText = "Ikan bernafas dengan paru-paru",
        answer = false,
        difficulty = Difficulty.MEDIUM
    )

    val question3 = Question<Int>(
        questionText = "1 + 1 = ?",
        answer = 2,
        difficulty = Difficulty.HARD
    )

    println(question1)
}