fun main() {
    val nullString: String? = null
    println(describeString(nullString))
}

fun describeString(maybeString: String?): String{
    return if (maybeString != null && maybeString.length > 0){
        "String of length is ${maybeString.length}"
    }
    else
        "Empty or null String"
}