import java.util.Scanner

//fun main() {
//    var names = arrayOf("Praveen", "Gaurav", "Akash", "Sidhant", "Abhi", "Mayank")
//    var index = 0
//
//    do {
//        println(names[index])
//        index++
//    } while (index != names.size)
//
//}


fun main(args : Array<String>) {
    println("Enter number to print table")
    var input = Scanner(System.`in`)
    var num = input.nextInt()
    var i = 0;

    do {
        println("$num X $i = "+num*i)
        i++
    }while (i <= 10)

}

