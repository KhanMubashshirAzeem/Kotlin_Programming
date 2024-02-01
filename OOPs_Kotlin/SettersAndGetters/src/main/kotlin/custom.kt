import java.lang.IllegalArgumentException

class Registration(email: String, pwd: String, age: Int, gender: Char) {
    var emailId: String = email
        get() {
            return field.toLowerCase()
        }
    var password: String = pwd
        set(value) {
            field = if (value.length > 6)
                value else throw IllegalArgumentException("Passwords is too small")
        }
    var age: Int = age
        set(value) {
            field = if (value > 18)
                value else throw IllegalArgumentException("Age must be 18+")
        }
    var gender : Char = gender
        set(value) {
            field = if (value == 'M')
                value else throw IllegalArgumentException("User should be male")
        }
}

fun main() {
    val reg = Registration("khanmubashshir08@gmail.com","121314",21,'M')
    println(reg.emailId)
    println(reg.password)
    println(reg.age.toString())
    println(reg.gender.toString())
}