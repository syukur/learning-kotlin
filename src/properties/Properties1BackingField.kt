package properties

class Person(){
    var name: String =""
        get() = field.uppercase()
        set(value) {
            field = value.trim()
        }
}

fun main() {
    val person = Person()
    person.name = " Elfathan "
    println(person.name)
}