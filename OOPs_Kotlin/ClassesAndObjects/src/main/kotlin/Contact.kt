
//class Contact(val id: Int, var email: String)
//
//fun main(){
//    val contact = Contact(25,"khanmubashshir08@gmail.com")
//    println(contact.email +"\n\t"+ contact.id)
//
//    contact.email = "mubashshirkhan217@nhitm.ac.in"
//    println(contact.email)
//
//}


//========================== Member Functions ===========================

class Contact (val id: Int , val email:String){
    fun printID(){
        println(id)
    }
}

fun main() {
    val contact = Contact(25,"Khanmubashshir08@gmail.com")
    contact.printID()
}