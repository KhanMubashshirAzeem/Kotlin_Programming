fun main(args: Array<String>) {
    val emp = employee1(18018, "Sagnik")
    // default value for emp_name will be used here
    val emp2 = employee1(11011)
    // default values for both parameters because no arguments passed
    val emp3 = employee1()
}

class employee1(empId: Int = 100, empName: String = "abc"){
    val id: Int
    val name: String

    init {
        id = empId
        name = empName

        print("Employee id is: $id, ")
        println("Employee name: $name")
        println()
    }
}