import kotlin.math.pow
import kotlin.math.sqrt

fun triangle(a: Double, b: Double, c: Double) {
    // Heron's formula
    println(0.25 * sqrt((a + b - c) * (a - b + c) * (-a + b + c) * (a + b + c)))
}

fun rectangle(a: Double, b: Double) {
    println(a * b)
}

fun circle(r: Double) {
    println(3.14 * r.pow(2.0))
}

fun main() {
    when (readLine()!!) {
        "triangle" -> triangle(readLine()!!.toDouble(), readLine()!!.toDouble(), readLine()!!.toDouble())
        "rectangle" -> rectangle(readLine()!!.toDouble(), readLine()!!.toDouble())
        "circle" -> circle(readLine()!!.toDouble())
        else -> println("error!")
    }
}
