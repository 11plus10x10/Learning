import java.util.*

fun main(args: Array<String>) {
    var pos = 0
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    repeat(n) {
        val num = scanner.nextInt()
        if (num > 0) ++pos
    }
    print(pos)
}
