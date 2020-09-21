import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var max = 4
    repeat(n) {
        val num = scanner.nextInt()
        if (num > max && num % 4 == 0) {
            max = num
        }
    }
    println(max)
}
