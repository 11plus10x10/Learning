fun main() {
    val input = readLine()!!
    val vowels = charArrayOf('a', 'e', 'i', 'o', 'u', 'y')
    var convertedInput = ""
    for (char in input) {
        convertedInput += if (char in vowels) "V" else "C"
    }
    var vCount = 0
    var cCount = 0
    var res = 0
    for (c in convertedInput) {
        if (c == 'V') {
            vCount++
            cCount = 0
        } else {
            cCount++
            vCount = 0
        }
        if (vCount == 3 || cCount == 3) {
            res++
            vCount = 1
            cCount = 1
        }
    }
    println(res)
}
