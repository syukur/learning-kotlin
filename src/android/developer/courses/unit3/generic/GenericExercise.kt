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

class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

fun main() {
    val question1 = Question<String>(
        questionText = "Berakit-rakit ke ___ , berenang-renang ke tepian",
        answer = "hulu",
        difficulty = "easy"
    )

    val question2 = Question<Boolean>(
        questionText = "Ikan bernafas dengan paru-paru",
        answer = false,
        difficulty = "medium",
    )

    val question3 = Question<Int>(
        questionText = "1 + 1 = ?",
        answer = 2,
        difficulty = "hard",
    )
}