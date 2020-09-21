import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val res = intArrayOf(scanner.nextInt(), 1, 1) // 0_max, 1_current-index, 2_max-index
    while (scanner.hasNextInt()) {
        val input = scanner.nextInt()
        res[1]++
        if (input > res[0]) {
            res[0] = input
            res[2] = res[1]
        }
    }
    println("${res[0]} ${res[2]}")
}
