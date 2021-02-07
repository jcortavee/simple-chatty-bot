fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var fix: Int = 0
    var ready: Int = 0
    var rejected: Int = 0

    repeat(n) {
        val v = readLine()!!.toInt()
        if (v == 1) {
            fix++
        } else if (v == -1) {
            rejected++
        } else {
            ready++
        }
    }

    println("$ready $fix $rejected")
}