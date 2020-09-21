import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = IntArray(n)
    for (index in arr.indices) arr[index] = scanner.nextInt()
    val shifts = scanner.nextInt() % n
    var lastNum: Int
    repeat(shifts) {
        lastNum = arr[arr.lastIndex]
        for (index in arr.lastIndex downTo 1) arr[index] = arr[index - 1]
        arr[0] = lastNum
    }
    for (index in arr.indices) print("${arr[index]} ")
}
