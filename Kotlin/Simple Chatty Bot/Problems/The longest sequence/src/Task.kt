import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var count = 0
    var sample = 0
    var res = 0
    val n = scanner.nextInt()
    repeat(n) {
        val num = scanner.nextInt()
        if (num >= sample) {
            sample = num
            ++count
        } else {
            if (count > res) res = count
            count = 1
            sample = num
        }
    }
    if (res < count) res = count
    println(res)
}
