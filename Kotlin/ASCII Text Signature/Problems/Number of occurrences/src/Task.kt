fun main() {
    val string = readLine()!!
    val subString = readLine()!!
    var count = 0
    for (i in 0..string.length - subString.length) {
        if (subString in string.substring(i, i + subString.length)) {
            count++
        }
    }
    println(count)
}
