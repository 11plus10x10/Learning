import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val i = scanner.nextInt()
    val j = scanner.nextInt()
    for (i in i..j) {
        var fz = false
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
            fz = true
        } else if (i % 3 == 0 && !fz) {
            println("Fizz")
        } else if (i % 5 == 0 && !fz) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}
