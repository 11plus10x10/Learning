import java.util.*

fun getLastDigit(num: Int): Int = Math.abs(num % 10)

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}
