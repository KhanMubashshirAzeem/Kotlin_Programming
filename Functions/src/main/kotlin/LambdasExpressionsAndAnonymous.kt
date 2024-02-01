//// with type annotation in lambda expression
//val sum1 = {a: Int, b: Int -> a+b }
//// without type annotation in lambda expression
//val sum2:(Int,Int) -> Int = {a,b -> a+b}
//
//fun main() {
//    val result1 = sum1(2,3)
//    val result2 = sum2(3,4)
//    println("The sum of two numbers is: $result1")
//    println("The sum of two numbers is: $result2")
//
//    // directly print the return value of lambda
//    // without storing in a variable.
//    println(sum1(5,7))
//    println("The multiplication of two number : "+multi(3,4))
//
//    println("Geeks".lambda4(5))
//
//    println("shorthand form of lambda function : "+numbers.filter { it > 0 })
//}
//
//val numbers = arrayOf(1,9,-8,7,6,-10)
//
//val multi = {a: Int, b: Int ->
//    val ans = a*b
//    ans.toString()
//
//}
//
//val lambda4 : String.(Int) -> String = {this + it}



// // ====================== return function by lambda Expression=================================

val find = fun(num: Int): String{
    return if(num % 2==0 && num < 0) {
        "Number is even and negative"
    }
    else if (num %2 ==0 && num >0){
        return "Number is even and positive"
    }
    else if(num %2 !=0 && num < 0){
        return "Number is odd and negative"
    }
    else {
        return "Number is odd and positive"
    }
}

fun main(args: Array<String>) {
    val result = find(112)
    println(result)
}
