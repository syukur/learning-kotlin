package properties

import kotlin.reflect.KProperty

class CacheStringDelegate(){

    var cachedValue: String? = null

    operator fun getValue(thisRef: User, property: Any?): String {
        if (cachedValue == null) {
            cachedValue = "${thisRef.firstName} ${thisRef.lastName}"
            println("Computed and cached: $cachedValue")
        }else{
            println("Accessed from cache $cachedValue")
        }

        return cachedValue ?: "Unknown"
    }


}

class User(val firstName: String, val lastName: String){
    val fullName: String by CacheStringDelegate()
}

fun main() {
    val user = User("John", "Doe")
    println(user.fullName)

    println(user.fullName)
}