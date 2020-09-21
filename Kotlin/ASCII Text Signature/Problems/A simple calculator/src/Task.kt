import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextLong()
    val op = scanner.next()
    val num2 = scanner.nextLong()
    println(when (op) {
        "+" -> "${num1 + num2}"
        "-" -> "${num1 - num2}"
        "/" -> if (num2 == 0L) "Division by 0!" else "${num1 / num2}"
        "*" -> "${num1 * num2}"
        else -> "Unknown operator"
    })
}
