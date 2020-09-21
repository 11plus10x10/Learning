import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var num = scanner.nextInt()
    var min = num
    repeat(n - 1) {
        num = scanner.nextInt()
        if (num < min) min = num
    }
    println(min)
}
