//      //we can set the name only in a method inside the class because of private modifier near set accessor.
class Company1(){
    var name: String = "abc"
        private set
    fun myfunc(n: String){
        name = n            // we set the name here
    }
}

fun main() {
    var c = Company1()
    println("Name of the company is : ${c.name}")
    c.myfunc("GeeksforGeeks")
    println("My new company name is ${c.name}")
}