data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex",12)
    val user1 = User("Khan",25)
    val user2 = User("Alex",12)

    println("User == User2 : ${user == user2}")
    println("User == User1 : ${user == user1}")

    println(user.copy("Max"))

}