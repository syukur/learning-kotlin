package scope.function

class Client1(){
    var token: String? = null
    fun connect()= println("connected!")
    fun authenticated() = println("authenticated!")
    fun getData(): String{
        println("getting data!")
        return "Mock data"
    }
}

val client1=Client1().apply {
    token = "Mock token"
}

fun main() {
   val result = client1.run {
        connect()
        authenticated()
        getData()
    }

    println(result)

    // contoh pemanfaatan run

    // contoh chaining StringBuilder dengan cara tradisional(java)
    // sangat verbose / bertele-tele, koding panjang
    var  sb : StringBuilder = StringBuilder("Data 0,")
    sb.append("Data 1,")
    sb.append("Data 2,")
    sb.append("Data 3")
    println(sb.toString())


    // 1. apply
    //return object nya sendiri
    var sb2: StringBuilder = StringBuilder("Data 0,").apply {
        append("Data 1,")
        append("Data 2,")
        append("Data 3")
    }
    println("apply: $sb2")

    //2. also
    //return object nya sendiri
    var sb7: StringBuilder = StringBuilder("Data 0,")
    sb7.also {
        it.append("Data 1,")
        it.append("Data 2,")
        it.append("Data 3")
    }
    println("also: $sb7")

    //3. run
    //return lambda
    var sb3: StringBuilder = StringBuilder("Data 0,")
    var sb4 = sb3.run {
        append("Data 1,")
        append("Data 2,")
        append("Data 3")
    }
    println("run: $sb4")

    //4. let
    //return lambda
    var sb5: StringBuilder = StringBuilder("Data 0,")
    var sb6 =sb5?.let {
        it.append("Data 1,")
        it.append("Data 2,")
        it.append("Data 3,")
    }
    println(sb5)




}