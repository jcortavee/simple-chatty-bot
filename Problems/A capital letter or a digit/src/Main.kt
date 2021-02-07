fun main() {
    // write your code here
    val char = readLine()!!.first()

    println(char.isDigit() && char != '0' || char.isLetter() && char.isUpperCase())
}