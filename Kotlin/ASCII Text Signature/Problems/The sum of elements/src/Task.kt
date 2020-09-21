fun main() {
    var num2 = 0
    do {
        val num1 = readLine()!!.toInt()
        num2 += num1
    } while (num1 != 0)
    println(num2)
}
