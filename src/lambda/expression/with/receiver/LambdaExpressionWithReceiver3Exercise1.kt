package lambda.expression.with.receiver

import javax.security.auth.callback.Callback

fun fetchData(callback: StringBuilder.() -> Unit) {
    val builder = StringBuilder("Data received")
    builder.callback()
}

fun main() {
  fetchData {
      append("- Processed")
      println(toString())
  }
}