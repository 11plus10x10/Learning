import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()
    for (i in 0..1000) {
        val x3 = Math.pow(i.toDouble(), 3.0).toInt()
        val x2 = Math.pow(i.toDouble(), 2.0).toInt()
        if (a * x3 + b * x2 + c * i + d == 0) println(i)
    }
}
