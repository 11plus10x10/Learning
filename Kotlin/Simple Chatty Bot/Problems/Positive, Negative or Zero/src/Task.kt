import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    if (num < 0) {
        println("negative")
    } else if (num > 0) {
        println("positive")
    } else {
        println("zero")
    }
}
