import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    var res: Long = 1
    for (i in a until b) {
        res *= i
    }
    println(res)
}
