import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // input
    val target = scanner.nextInt()
    val overSleep = scanner.nextInt()
    val sleepHours = scanner.nextInt()

    // checks
    if (sleepHours in target..overSleep) {
        println("Normal")
    } else if (sleepHours > overSleep) {
        println("Excess")
    } else {
        println("Deficiency")
    }
}
