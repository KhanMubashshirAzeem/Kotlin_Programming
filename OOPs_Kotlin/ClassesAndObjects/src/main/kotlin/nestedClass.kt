class Car1 {
    var make: String = ""
    var model: String = ""
    var year: Int = 0
    fun getInfo():String {
        return "$make $model, year $year"
    }

    inner class Engine{
        var horsepower: Int = 0
        var cylinders: Int = 0

        fun getEngineInfo(): String{
            return "$horsepower horsepower, $cylinders cylinders, in a $make $model"
        }
    }
}

fun main() {
    val mycar = Car1()
    mycar.make = "Toyota"
    mycar.model = "Camry"
    mycar.year = 2020

    println(mycar.getInfo())

    println(Car1().Engine().getEngineInfo())


//    val  engine = mycar.Engine()
//    engine.horsepower = 250
//    engine.cylinders = 6
//
//    println(engine.getEngineInfo())
}