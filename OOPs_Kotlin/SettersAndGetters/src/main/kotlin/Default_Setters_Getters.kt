class Company {
    var name: String = ""
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val c = Company()
    c.name = "KhanOrganisation"
    println(c.name)
}
