//fun main() {
//    var rollno = 5
//    for (i in 1..10){
//        if (i == rollno){
//            break
//        }
//        println(i)
//    }
//}

//      //Example: Calculate Sum Until User enters 0
//fun main() {
//    var sum = 0
//    var number: Int
//
//    while (true){
//        println("Enter a number")
//        number = readLine()!!.toInt()
//        if (number == 0){
//            break
//        }
//        sum += number
//    }
//    println("sum is $sum")
//}

fun main(args: Array<String>) {

    first@ for (i in 1..4) {

        second@ for (j in 1..2) {
            println("i = $i; j = $j")

            if (i == 2)
                break@second
        }
    }
}
