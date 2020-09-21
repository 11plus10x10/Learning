import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var money = scanner.nextInt()
    var enough = true
    var purchase = 0
    while (scanner.hasNext() && enough) {
        purchase = scanner.nextInt()
        if (money - purchase >= 0) money -= purchase else enough = false
    }
    if (enough) {
        println("Thank you for choosing us to manage your account! You have $money money.")
    } else {
        println("Error, insufficient funds for the purchase. You have $money, but you need $purchase.")
    }
}
