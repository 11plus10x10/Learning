fun main() {
    val word = readLine()!!
    for (i in word) {
        if (i.isDigit()) {
            println(i)
            break
        } else continue
    }
}
