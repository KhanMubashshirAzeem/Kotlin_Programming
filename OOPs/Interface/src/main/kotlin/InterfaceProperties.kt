interface InterfaceProperties {
    val a: Int
    val b: String
        get() = "Hello"
}

class PropertiesDemo : interfaceProperties {
    override val a: Int = 5000
    override val b: String = "Properties Overridden"
}

fun main() {
    val x = PropertiesDemo()
    println(x.a)
    println(x.b)
}


