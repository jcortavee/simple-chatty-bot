fun main() {
    // put your code here
    val number = readLine()!!.toInt()

    println(number / 100 + number % 100 / 10 + number % 10)
}