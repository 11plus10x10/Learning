import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = IntArray(n)
    var count = 0
    for (index in arr.indices) arr[index] = scanner.nextInt()
    val m = scanner.nextInt()
    for (index in arr.indices) if (arr[index] == m) ++count else continue
    if (count == 0) println("NO") else println("YES")
}
