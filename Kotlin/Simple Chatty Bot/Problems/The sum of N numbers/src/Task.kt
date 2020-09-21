import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum = 0
    val n = scanner.nextInt()
    repeat(n) {
        val num = scanner.nextInt()
        sum += num
    }
    println(sum)
}
