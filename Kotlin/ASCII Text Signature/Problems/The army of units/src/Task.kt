import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val army = scanner.nextInt()
    when {
        army < 1 -> println("no army")
        army in 1..4 -> println("few")
        army in 5..9 -> println("several")
        army in 10..19 -> println("pack")
        army in 20..49 -> println("lots")
        army in 50..99 -> println("horde")
        army in 100..249 -> println("throng")
        army in 250..499 -> println("swarm")
        army in 500..999 -> println("zounds")
        army >= 1000 -> println("legion")
    }
}
