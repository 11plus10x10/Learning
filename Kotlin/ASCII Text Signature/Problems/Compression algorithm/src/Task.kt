fun main() {
    val input = readLine()!!
    var char = ' '
    var count = 0
    for (i in input.indices) {
        if (input[i] != char) {
            char = input[i]
            for (j in i..input.lastIndex) {
                if (input[i] == input[j]) count++ else break
            }
            print("${input[i]}$count")
            count = 0
        } else continue
    }
}
