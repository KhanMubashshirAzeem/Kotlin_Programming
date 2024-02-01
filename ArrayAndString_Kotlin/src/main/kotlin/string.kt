fun main(args: Array<String>){
    // accessing string elements one by one
    var str = "Hello"
    println(str[0])
    println(str[1])
    println(str[2])
    println(str[3])
    println(str[4])
    // accessing the string elements using for loop
    var str2 = "Geeks"
    for(i in str2.indices){
        print(str2[i]+" ")
    }

    println("\n-----------------------------------------")
    val str1 = "Geeks"
    println("$str1 is a string which length is ${str.length}")
    println(str2.get(2))
    println(str2.subSequence(0,2))

    println("\n-----------------------------------------")
    // raw string - multiline string
    var str3 = """My 
        |name 
        |is 
        |Khan"""
        .trimMargin()
    println(str3)

    println("\n-----------------------------------------")
    var x = "GeeksForGeeks"
    var y = "GeeksForGeeks"
    var z = "Geeks"
    println(x===y) // true , as both are pointing to the same StringPool
    println(x==z) //false since values are not equal
    println(x===z) //false

}
