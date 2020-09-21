import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var max1 = 0
    var max2 = 1

    // input
    val n = scanner.nextInt()
    repeat(n) {
        val num = scanner.nextInt()
        if (num > max1) {
            max1 = num
        } else if (num > max2) {
            max2 = num
        }
    }
    println(max1 * max2)
}