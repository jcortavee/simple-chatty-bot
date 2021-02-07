import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val resses = scanner.nextInt()
    val weekend = scanner.nextBoolean()
    val result = !weekend && resses >= 10 && resses <= 20 || weekend && resses >= 15 && resses <= 25
    println(result)
}