package android.developer.courses.function.unit2

fun main() {
    //val  trickFunction = ::trick
//    val  trickFunction = trick // 1. STORE A FUNCTION INTO A VARIABLE
//    trick()
//    trickFunction()
//    treat()
//
//    val treatFunction = trickOrTreat(false)
//    val trickFunction2 = trickOrTreat(true)
//
//    treatFunction()
//    trickFunction2()

    /**
     * omit the parameter name
     * jika sebuah funtion hanya memiliki satu parameter,
     * nama paramter bisa di hilangkan saja (omit),
     * untuk mengakses parameter bisa menggunakan keyword it
     *
     * jika
      */ 
    val coins: (Int) -> String = {
        "$it quartets"
    }

    val cupcake: (Int) -> String = { quantity ->
        "$quantity cupcakes"
    }

    //val treatFunction = trickOrTreat(false, coins)
    //val treatFunction = trickOrTreat(false, { quantity ->  "$quantity quarters"})
    //val treatFunction = trickOrTreat(false, {"$it quarters"})
    val treatFunction = trickOrTreat(false){"$it quarters"}
    val trickFunction = trickOrTreat(true, null)

    /**
     * sebuah function yang memiliki argument function lain,
     * atau mengembalikan nilai (return value) functiin lain,
     * di sebut sebagai higher-order function
     * kita bisa membuat higher-order functin sendiri
     * selain itu kotlin juga mengediakan higher-order functin bawaan
     * contoh nya fungsi repeat(timesL Int, action(Int) -> Unit)
     */
    repeat(4){
        treatFunction()
    }
    trickFunction()

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
//fun trickOrTreat(isTrick: Boolean) : ()-> Unit{
//    if (isTrick) {
//        return trick
//    }else{
//        return treat
//    }
//}


// 4. pass a function to other function as an argument
fun trickOrTreat(
    isTrick: Boolean,
    extraTreat: ((Int)-> String)?
): ()-> Unit {

   if (isTrick) {
       return trick
   }else{
       if (extraTreat != null) println(extraTreat(5))
       return treat
   }
}

