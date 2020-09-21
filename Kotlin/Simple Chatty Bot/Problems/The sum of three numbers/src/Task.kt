import java.util.Scanner

fun sum(num1: Int, num2: Int, num3: Int): Int = num1 + num2 + num3

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(sum(a, b, c))
}
