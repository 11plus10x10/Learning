import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = IntArray(n)
    val arrRes = IntArray(n)
    for (index in arr.indices) arr[index] = scanner.nextInt()
    val lastNum = arr[arr.lastIndex]
    for (index in 1 until arrRes.size) {
        arrRes[index] = arr[index - 1]
    }
    arrRes[0] = lastNum
    for (index in arrRes.indices) print("${arrRes[index]} ")
}
