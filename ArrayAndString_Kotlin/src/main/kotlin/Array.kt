fun main() {
    var arr = byteArrayOf(1,2,3,4,5)
    for (i in 0..arr.size-1){
        println(" "+arr[i])
    }
    println(" ")
    var arr2 = charArrayOf('A','B','C','D','E')
    for (j in 0..arr2.size-1){
        println(arr2[j])
    }

    val arr3 = Array(5, {l -> l * 1 })
    for (l in 0..arr3.size-1){
        println(arr3[l])
    }

    println("-----------------------------------------")
    val num = arrayOf(10,11,12,13,14)
    num.set(0,20)
    num.set(1,21)
    println(num.get(0))
    println(num[1])

    println("-----------------------------------------")
    val num1 = arrayOf<Int>(1, 2, 3, 4, 5)
    num.set(0, 10)
    num.set(1, 6)
    for (i in num1.indices)
    {
        println(num1[i])
    }

    val array = arrayOf<Int>(9,8,7,6,5)
    array.forEach({index -> println(index)})
    

}