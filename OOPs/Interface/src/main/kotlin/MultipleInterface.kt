interface interfaceProperties {
    val a: Int
    val b: String
        get() = "Hello"
}

interface InterfaceMethods{
    fun description()
}

class MultipleInterface: interfaceProperties,InterfaceMethods{
    override val a: Int
        get() = 50

    override fun description() {
        println("Multiple Interface Implemented")
    }
}

fun main() {
    val obj = MultipleInterface()
    obj.description()
}
