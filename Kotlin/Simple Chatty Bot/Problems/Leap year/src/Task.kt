import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val year = scanner.nextInt()
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        println("Leap")
    } else {
        println("Regular")
    }
}
