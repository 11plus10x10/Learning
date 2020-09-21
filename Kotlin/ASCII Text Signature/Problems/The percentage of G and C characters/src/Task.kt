fun main() {
    val sequence = readLine()!!.toLowerCase()
    var count = 0
    for (i in sequence) if (i == 'g' || i == 'c') count++
    println(count / sequence.length.toDouble() * 100)
}
