package scope.function

class Client(){
    var token: String? = null
    fun connect()= println("connected!")
    fun authenticated() = println("authenticated!")
    fun getData(): String{
        println("getting data!")
        return "Mock data"
    }
}

/**
 * Contoh penggunaan apply,
 * untuk inisialisai object
 */

val client = Client().apply {
    token = "JSLD_23232_sldasas"
    connect()
    authenticated()
}

fun main() {
    println(client.getData())
}