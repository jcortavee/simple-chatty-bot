fun main() {
    // put your code here
    val days = readLine()!!.toInt()
    val costFood = readLine()!!.toInt()
    val oneWayFlight = readLine()!!.toInt()
    val costOneNight = readLine()!!.toInt()

    println(days * costFood + costOneNight * (days - 1) + oneWayFlight * 2)
}