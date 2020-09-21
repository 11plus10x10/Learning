import java.util.*

fun dataRead() {
    // input
    val scanner = Scanner(System.`in`)
    val array = IntArray(6)
    for (i in 0..5) {
        array[i] = scanner.nextInt()
    }

    // output
    for (i in 0..1) {
        print("${array[i]}:")
    }
    print("${array[2]} ")
    for (i in 3..4) {
        print("${array[i]}/")
    }
    print("${array[5]}")
}

fun main(args: Array<String>) {
    dataRead()
}
