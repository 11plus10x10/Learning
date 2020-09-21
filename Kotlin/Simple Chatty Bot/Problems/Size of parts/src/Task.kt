import java.util.*

fun main(args: Array<String>) {
    // detector
    var larger = 0
    var smaller = 0
    var perfect = 0

    // input
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    repeat(n) {
        val part = scanner.nextInt()
        if (part == 1) {
            ++larger
        } else if (part == -1) {
            ++smaller
        } else {
            ++perfect
        }
    }
    println("$perfect $larger $smaller")
}
