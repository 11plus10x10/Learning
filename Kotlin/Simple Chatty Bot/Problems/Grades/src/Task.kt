import java.util.*

fun main(args: Array<String>) {
    // grades
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    // input
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    repeat(n) {
        val grade = scanner.nextInt()
        if (grade == 5) {
            a = ++a
        } else if (grade == 4) {
            b = ++b
        } else if (grade == 3) {
            c = ++c
        } else if (grade == 2) {
            d = ++d
        }
    }
    println("$d $c $b $a")
}
