import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var res = 0
    for (i in a..b) {
        res += i
    }
    println(res)
}
