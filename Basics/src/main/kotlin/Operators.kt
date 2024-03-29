fun main(args: Array<String>)
{
    var a = 20
    var b = 4
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a.times(b)))
    println("a / b = " + (a / b))
    println("a % b = " + (a.rem(b)))

    println("===================================")

    var c = 30
    var d = 40
    println("c > d = $(c>d)")
    println("c < d = $(c.compareTo(d) < 0)")
    println("c >= d = $(c>=d)")
    println("c <= d = $(c.compareTo(d) <= 0)")
    println("c == d = $(c==d)")
    println("c != d = $(!(c?.equals(d) ?: (d === null)))")

    println("===================================")
    var a1 = 10
    var b1 = 5
    a+=b
    println(a)
    a-=b
    println(a)
    a*=b
    println(a)
    a/=b
    println(a)
    a%=b
    println(a)

    println("===================================")
    var e=10
    var flag = true
    println("First print then increment: "+ e++)
    println(e)
    println("First increment then print: "+ ++e)
    println(e)
    println("First print then decrement: "+ e--)
    println(e)
    println("First decrement then print: "+ --e)
    println(e)

    println("\n===================================")
    var x = 100
    var y = 25
    var z = 10
    var result = false
    if(x > y && x > z)
        println(x)
    if(x < y || x > z)
        println(y)
    if( result.not())
        println("Logical operators")

    println("\n========================================================")
    println("5 signed shift left by 1 bit: " + 5.shl(1))
    println("10 signed shift right by 2 bits: : " + 10.shr(2))
    println("12 unsigned shift right by 2 bits:  " + 12.ushr(2))
    println("36 bitwise and 22: " + 36.and(22))
    println("36 bitwise or 22: " + 36.or(22))
    println("36 bitwise xor 22: " + 36.xor(22))
    println("14 bitwise inverse is: " + 14.inv())


}
