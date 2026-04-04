package function

fun main() {
    val actions = listOf("title","year","author")
    val prefix = "https://example.com/book-info"
    val id = 6

    val urls = actions.map { action -> "$prefix/$id/$action" }
    //println(urls)
    for (url in urls)
        println(url)
}