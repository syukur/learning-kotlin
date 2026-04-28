package properties

fun checkAppServer(): Boolean {
    println("Performing application server health check...")
    return true
}

fun checkDatabase(): Boolean {
    println("Performing database health check...")
    return false
}

fun main() {
// Write your code here
    val isAppServerHealthy : Boolean by lazy { checkAppServer() }
    val isDatabaseHealthy: Boolean by lazy { checkDatabase() }

    when {
        isAppServerHealthy -> println("Application server is online and healthy")
        isDatabaseHealthy -> println("Database is healthy")
        else -> println("System is offline")
    }
// Performing application server health check...
// Application server is online and healthy
}