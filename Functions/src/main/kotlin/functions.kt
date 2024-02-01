fun main() {
    val array = arrayOf(5,9,6,7,8,4).sum()
    println("The sum of all the elements of an array is : $array")

    val num1 = 6
    val num2 = 3
    val result = num1.rem(num2)
    println("The remainder when $num1 id divided by num2 is: $result")

    println("The multiplication of $num1 with $num2 is "+multiplication(num1,num2)) // we can declare the value before calling the function

    println("The multiplication is "+multiplication(5,6)) // And we can also assign the value while calling the function

    println("The factorial of $num1 is : "+factorial(num1))

    greet()
    greet(" Khan!")

    printName("Khan" , "Mubashshir")
// Call with named arguments
    printName(lastName = "Mubashshir", firstName = "Khan") // Output: First name: John, Last name: Doe

}


fun multiplication(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun factorial(num1: Int): Int{
    if (num1 == 0 || num1 == 1){
        return 1;
    }
    return num1 * factorial(num1-1)
}

fun greet(name: String = "World") {
    println("Hello, $name!")
}

fun printName(firstName: String, lastName: String) {
    println("First name: $firstName, Last name: $lastName")
}


