package android.developer.courses.function

fun main() {
    //val  trickFunction = ::trick
    val  trickFunction = trick // 1. STORE A FUNCTION INTO A PARAMETER
    trick()
    trickFunction()
    treat()

    val treatFunction = trickOrTreat(false)
    val trickFunction2 = trickOrTreat(true)

    treatFunction()
    trickFunction2()
}

val trick = {
    println("No treats!")
}

/**
 * 2. FUNCTION DATA TYPE,
 *
 * in this example function data type explicitly define
 * ()-> Unit
 * ()   means the function have no parameter
 * ->   delimiter between function parameter and function return value
 * Unit means the function return no value
 */
val treat: ()-> Unit = {
    println("Have a treat!")
}

/**
 * 3. use a function as a return type
 */
fun trickOrTreat(isTrick: Boolean) : ()-> Unit{
    if (isTrick) {
        return trick
    }else{
        return treat
    }
}

//fun trick(){
//    println("No treats!")
//}