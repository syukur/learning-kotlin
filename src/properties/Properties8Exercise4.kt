package properties

import kotlin.properties.Delegates.observable

class Budget(val totalBudget: Int) {
    var remainingBudget: Int by observable(totalBudget) { _, old, new ->
        if (new < (totalBudget * 0.20))
            println("Warning latest budget under 20% from initial budget")

        if(new > old)
            println("Latest budget is increase from previous budget :)")
    }
}

fun main() {
    val myBudget = Budget(totalBudget = 1000)
    myBudget.remainingBudget = 800
    myBudget.remainingBudget = 150
// Warning: Your remaining budget (150) is below 20% of your total budget.
    myBudget.remainingBudget = 50
// Warning: Your remaining budget (50) is below 20% of your total budget.
    myBudget.remainingBudget = 300
// Good news: Your remaining budget increased to 300.
}