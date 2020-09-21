import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = IntArray(n)
    val res = intArrayOf(0, 0) // 0_max, 0_index
    for (i in arr.indices) {
        arr[i] = scanner.nextInt()
        if (arr[i] > res[0]) {
            res[0] = arr[i]
            res[1] = i
        }
    }
    println(res[1])
}