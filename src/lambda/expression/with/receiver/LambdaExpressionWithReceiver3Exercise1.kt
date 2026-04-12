package lambda.expression.with.receiver

import javax.security.auth.callback.Callback

fun fectData(callback: StringBuilder.() -> Unit) {
    val builder = StringBuilder("Data received")
    builder.callback()
}

fun main() {
  fectData {
      append("- Processed")
      println(toString())
  }
}