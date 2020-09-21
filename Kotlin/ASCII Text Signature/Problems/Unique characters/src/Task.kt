fun main() {
    val word = readLine()!!
    var collecition = ""
    var count = 0
    for (i in word) {
        for (j in word) {
            if (i == j) count++
        }
        if (count == 1) collecition += i.toString()
        count = 0
    }
    println(collecition.length)
}
