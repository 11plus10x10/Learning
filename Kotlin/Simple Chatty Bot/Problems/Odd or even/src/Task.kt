import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num = scanner.nextInt()
    if (num % 2 == 0) {
        println("EVEN")
    } else {
        println("ODD")
    }
}
