import java.util.Scanner

fun arrayInput() {
    val scanner = Scanner(System.`in`)
    val arrSize = scanner.nextInt()
    val arr = IntArray(arrSize)
    for (index in arr.indices) arr[index] = scanner.nextInt()
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    var res = 0
    for (i in 0 until arr.size - 1) {
        if (arr[i] == n && arr[i + 1] == m || arr[i] == m && arr[i + 1] == n) ++res else continue
    }
    if (res == 0) println("YES") else println("NO")
}

fun main() {
    arrayInput()
}
