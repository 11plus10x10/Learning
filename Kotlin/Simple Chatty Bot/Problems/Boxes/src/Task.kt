import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // box1 input
    var box1h = scanner.nextInt()
    var box1w = scanner.nextInt()
    var box1d = scanner.nextInt()

    // box1 sort
    if (box1h > box1w) {
        val buff = box1w
        box1w = box1h
        box1h = buff
    }
    if (box1w > box1d) {
        val buff = box1d
        box1d = box1w
        box1w = buff
    }
    if (box1h > box1w) {
        val buff = box1w
        box1w = box1h
        box1h = buff
    }
    if (box1w > box1d) {
        val buff = box1d
        box1d = box1w
        box1w = buff
    }

    // box2 input
    var box2h = scanner.nextInt()
    var box2w = scanner.nextInt()
    var box2d = scanner.nextInt()

    // box2 sort
    if (box2h > box2w) {
        val buff = box2w
        box2w = box2h
        box2h = buff
    }
    if (box2w > box2d) {
        val buff = box2d
        box2d = box2w
        box2w = buff
    }
    if (box2h > box2w) {
        val buff = box2w
        box2w = box2h
        box2h = buff
    }
    if (box2w > box2d) {
        val buff = box2d
        box2d = box2w
        box2w = buff
    }

    var equ = false
    var inc2 = false

    // box equality
    if (box1h + box1w + box1d == box2h + box2w + box2d && box1d == box2d) {
        println("Box 1 = Box 2")
        equ = true
        inc2 = true
    }

    // box1 > box2 check
    if (box1h >= box2h && box1w >= box2w && box1d >= box2d && !equ) {
        println("Box 1 > Box 2")
        inc2 = true
    }

    // box2 > box1 check
    if (box2h >= box1h && box2w >= box1w && box2d >= box1d && !equ) {
        println("Box 1 < Box 2")
        inc2 = true
    }

    // incomparable
    if (box1h + box1w + box1d == box2h + box2w + box2d && box1d != box2d && !equ) {
        println("Incomparable")
        inc2 = true
    }

    // incomparable2
    if (box1h + box1w + box1d != box2h + box2w + box2d && !inc2) {
        println("Incomparable")
    }
}
