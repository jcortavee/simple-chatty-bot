fun main() {
    // write your code here
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    val num4 = readLine()!!.toInt()
    val num5 = readLine()!!.toInt()

    println(num5 in num1..num2 && num5 in num3..num4)
}