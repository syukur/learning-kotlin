package properties

class Database(){
    fun connect(){
        println("Connecting to database...")
    }

    fun query(sql: String): List<String>{
        return listOf("Data1","Data2","Data3","Data4")
    }
}

val databaseConnection: Database by lazy {
    val db = Database()
    db.connect()
    db
}

fun fetchData(){
    val data = databaseConnection.query("SELECT * FROM data")
    println("Data: $data")
}

fun main() {
    // Fist time accessing databaseConnection
    fetchData()
    //Connecting to database...
    //Data: [Data1, Data2, Data3, Data4]

    // Subsequent access uses the exisiting connection
    fetchData()
    //Data: [Data1, Data2, Data3, Data4]
}