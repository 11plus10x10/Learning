import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var num = scanner.nextInt()
    var sample = num
    var validity = true
    repeat(n - 1) {
        num = scanner.nextInt()
        if (sample <= num && validity) {
            sample = num
            validity = true
        } else {
            validity = false
        }
    }
    if (validity) println("YES") else println("NO")
}
