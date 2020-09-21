fun main() {
    val string = readLine()!!
    if (string.length % 2 == 0) {
        val forbidden = intArrayOf(string.length / 2 - 1, string.length / 2)
        for (i in string.indices) {
            if (i in forbidden) continue else print(string[i])
        }
    } else {
        val forbidden = string.length / 2
        for (i in string.indices)
            if (i == forbidden) continue else print(string[i])
    }
}
