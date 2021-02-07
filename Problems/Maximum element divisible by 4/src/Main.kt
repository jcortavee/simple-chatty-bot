fun main() {
    // put your code here
    val n = readLine()!!.toInt()

    var max: Int = 0

    repeat(n) {
        val value = readLine()!!.toInt()

        if (value % 4 == 0 && value > max) max = value
    }

    println(max)
}