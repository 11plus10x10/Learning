import java.util.*

fun divide(num1: Long, num2: Long): Double = num1.toDouble() / num2.toDouble()

/* Do not change code below */
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    println(divide(a, b))
}
