import java.util.*

fun main(args: Array<String>) {
    // input
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    val n = scanner.nextInt()
    println("Symbol # $n of the string \"$str\" is \'${str[n - 1]}\'")
}
