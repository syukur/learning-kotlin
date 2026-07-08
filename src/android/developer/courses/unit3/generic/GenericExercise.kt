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

interface ProgressPrintable{
    val progressText: String
    fun printProgressBar()
}

class Quiz() : ProgressPrintable{

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

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

    companion object StudentProgress{
        var total = 10
        var answered = 3
    }

    fun printQuiz(){
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }

        println()

        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }

        println()

        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
}

//
//val Quiz.StudentProgress.progressText: String
//    get() = "${answered} of $total answered"

//fun Quiz.StudentProgress.printProgressBar() {
//    repeat(Quiz.answered) { print("▓") }
//    repeat(Quiz.total - Quiz.answered) { print("▒") }
//    println()
//}

fun main() {
   // println("${Quiz.answered} of ${Quiz.total} answered.")
    //Quiz().printProgressBar()
    Quiz().printQuiz()
}