fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    var max1 = 1
    var max2 = 1

    repeat(n) {
        val value = readLine()!!.toInt()

        if (value > max2 && value > max1) {
            max1 = value
        } else if (value > max2 && value <= max1) {
            max2 = value
        }
    }

    print(max1 * max2)
}