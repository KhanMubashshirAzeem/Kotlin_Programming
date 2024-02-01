////==========================Iterate through range using for loop –
//fun main() {
//    println()
//    for (i in 1..6) {
//        print("$i ")
//    }
//    //====================== 1-10 in 4 steps
//    println()
//    for (i in 1..10 step 3) {
//        print("$i ")
//    }
//    //===================== It will print nothing
//    println()
//    for (i in 5..1) {
//        print("$i ")
//    }
//    //==================== Now it will print
//    println()
//    for (i in 5 downTo 1) {
//        print("$i ")
//    }
//    //====================== 10-0 in 4 steps
//    println()
//    for (i in 10 downTo 0 step 3) {
//        print("$i ")
//    }
//}


//// //Iterate through array using for loop –
//fun main() {
//    var numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
//    for (num in numbers){
//        if (num%2 == 0){
//            print("$num ")
//        }
//    }
//
//    println("")
//
//    var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn", "Moon", "sun")
////    for (i in planets.indices){
////        println(planets[i])
////    }
//
//    for ((index,value ) in planets.withIndex()){
//        println("Element at $index th index  is $value")
//    }
//
//}


fun main(args: Array<String>) {
    var name = "Geeks"
    var name2 = "forGeeks"

    // traversing string without using index property
    for (alphabet in name)
        print("$alphabet ")

    // traversing string with using index property
    for (i in name2.indices)
        print(name2[i] + " ")
    println(" ")

    // traversing string using withIndex() library function
    for ((index, value) in name.withIndex())
        println("Element at $index th index is $value")
}
