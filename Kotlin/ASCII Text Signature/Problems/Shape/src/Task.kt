import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val choice = "You have chosen a"
    println(when (scanner.nextInt()) {
        1 -> "$choice square"
        2 -> "$choice circle"
        3 -> "$choice triangle"
        4 -> "$choice rhombus"
        else -> "There is no such shape!"
    }) 
}
