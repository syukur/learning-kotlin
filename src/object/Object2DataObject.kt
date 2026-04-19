package `object`

data object AppConfig{
    val appName = "My Application"
    val version = "1.0.0"
}

fun main() {
    println(AppConfig)
    println(AppConfig.appName)

}