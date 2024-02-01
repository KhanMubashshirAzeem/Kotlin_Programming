import kotlin.random.Random

data class Employees(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")
    fun generateEmployee() =
        Employees(
            names.random(),
            Random.nextInt(from = minSalary, until = maxSalary)
        )
}

fun main() {
    val empGen = RandomEmployeeGenerator(100,150)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())

    empGen.minSalary = 250
    empGen.maxSalary = 400
    println(empGen.generateEmployee())

}