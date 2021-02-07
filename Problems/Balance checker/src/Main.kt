import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)

    var amount = scanner.nextInt()
    var canBuyIt = true
    var lastPrice = 0

    while (scanner.hasNext() && canBuyIt) {
        val price = scanner.nextInt()

        if (amount >= price) {
            amount -= price
        } else {
            lastPrice = price
            canBuyIt = false
        }
    }

    if (canBuyIt) {
        println("Thank you for choosing us to manage your account! You have $amount money.")
    } else {
        println("Error, insufficient funds for the purchase. You have $amount, but you need $lastPrice.")
    }
}