fun randomPrint(range: CharRange, n: Int) {
    if (n > 0) {
        var count = 1
        var str = "${range.random()}"
        while (count < n) {
            val ch = charArrayOf(range.random())
            if (ch[0] != str[str.lastIndex]) {
                str += ch[0]
                count++
            }
        }
        print(str)
    }
}

fun main() {
    val input = readLine()!!.split(' ')
    val a = 'A'..'Z'
    val b = 'a'..'z'
    val c = '0'..'9'
    val check = input[3].toInt() - (input[0].toInt() + input[1].toInt() + input[2].toInt())
    randomPrint(a, input[0].toInt())
    randomPrint(b, input[1].toInt())
    randomPrint(c, input[2].toInt())
    if (check > 0) {
        randomPrint(a, check)
    }
}
