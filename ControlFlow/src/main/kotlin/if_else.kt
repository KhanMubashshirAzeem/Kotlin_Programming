import java.util.*

//fun main(args: Array<String>) {
//    var a = 10
//    var b = 20
//    if (a > b) {
//        println("A is greater than B")
//    }
//    else{
//        println("B is greater than A")
//    }
//
//}

//fun main(args: Array<String>) {
//    var a = 10
//    var b = 20
//    var max = if (a > b) {
//        print("Greater number is: ")
//        a
//    }
//    else{
//        print("Greater number is: ")
//        b
//    }
//    println(max)
//}


fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    println("Enter 3 number: ")
    val n1 = input.nextInt()
    val n2 = input.nextInt()
    val n3 = input.nextInt()

    val Max = if (n1 > n2) {
        if (n1 > n3) {
            "$n1 is largest number "
        }
        else
            "$n3 is the largest number"
    }
    else if (n2 > n3) {
        "$n2 is the largest number"
    }
    else{
        "$n3 is the largest number"
    }
    println(Max)

}

