//fun main() {
//    loop@ for (i in 1..10){
//        if (i==5){
//            continue@loop
//        }
//        println("$i")
//    }
//}

fun main(args: Array<String>) {

    here@ for (i in 1..5) {
        for (j in 1..4) {
            if (i == 3 || j == 3)
                continue@here
            println("i = $i; j = $j")
        }
    }
}