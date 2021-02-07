fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var result: Int = 0

    for (i in a..b) {
        result += i
    }

    println(result)
}