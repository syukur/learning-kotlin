package intermediate.nullsafety

fun main() {

    data class User(
        val id: Int,
        val name: String,
        // List of friend user IDs
        val friends: List<Int>
    )

    // Function to get a number of friend for a user
    fun getNumberOfFriends(users: Map<Int,User>, userId: Int): Int {
        // Retrieve the user or return -1 if not found
        val user = users[userId] ?: return -1
        // Return the number of friends
        return user.friends.size
    }

    // Creates some sample users
    val user1 = User(1, "Alice", listOf(2, 3))
    val user2 = User(2, "Bob", listOf(1))
    val user3 = User(3, "Charlie", listOf(1))

    // Create a map of users
    val users = mapOf(1 to user1, 2 to user2, 3 to user3)

    println(getNumberOfFriends(users,1))
    // 2
    println(getNumberOfFriends(users,2))
    // 1
    println(getNumberOfFriends(users,4))
    // -1
}