package intermediate.nullsafety

fun main() {
//    val fruits = listOfNotNull("banana", null,"avocado", null,"apple", "kiwi")
//    println(fruits)

    val serverConfig = mapOf(
        "appConfig.json" to "App Configuration",
        "dbConfig.json" to "Database Configuration"
    )

    val requestedFile ="appConfig.json1"
    val configFiles = listOfNotNull(serverConfig[requestedFile])
    //val configFiles = listOf(serverConfig[requestedFile])

    println(configFiles)
}