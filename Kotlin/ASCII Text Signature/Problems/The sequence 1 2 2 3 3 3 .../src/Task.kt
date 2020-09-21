fun main() {
    val num = readLine()!!.toInt()
    var count = 0
    var prints = 0
    while (prints < num) {
        count++
        val repeats = if (num - count > prints) count else num - prints
        repeat(repeats) {
            print("$count ")
            prints++
        }
    }
}
