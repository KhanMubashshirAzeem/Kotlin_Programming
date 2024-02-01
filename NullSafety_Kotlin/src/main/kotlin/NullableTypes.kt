fun main() {

    var neverNull : String = "This can't be null"
    println(neverNull)
//    neverNull = null      // Throws a compiler error
//    println(neverNull)

    // nullable has nullable String type
    var nullable: String? = "This can keep a null here"
    nullable = null

    // byDefault null values aren't accepted
    var inferredNonNull = "The compiler assumes non-null"
//    inferredNonNull = null    //throw compiler error
    println(inferredNonNull)

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int{
        return notNull.length
    }

    println(strLength(neverNull)) // 18
//    println(strLength(nullable))  // Throws a compiler error

}