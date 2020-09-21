import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    if (num in -14..12 || num in 15..16 || num >= 19) {
        println("True")
    } else {
        println("False")
    }
}
