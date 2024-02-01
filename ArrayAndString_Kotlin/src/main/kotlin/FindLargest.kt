fun main(args: Array<String>) {
    var sum = arrayOf(1,20,33,4,5,6,7,8,9,10)
    var key = 0
    for (i in 0..sum.size-1){
        if (key < sum[i]){
            key = sum[i]
        }
    }
    println(key)
}
