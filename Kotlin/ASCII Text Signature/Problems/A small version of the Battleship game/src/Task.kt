fun main() {
    val input = readLine()!!.split(' ')
    val x = IntArray(input.size / 2)
    val y = IntArray(input.size / 2)
    var resX = ""
    var resY = ""
    for ((i, j) in (0..input.lastIndex step 2).withIndex()) {
        x[i] = input[j].toInt()
    }
    for ((i, j) in (1..input.lastIndex step 2).withIndex()) {
        y[i] = input[j].toInt()
    }
    for (i in 1..5) {
        if (i !in x) resX += "$i "
    }
    for (i in 1..5) {
        if (i !in y) resY += "$i "
    }
    println(resX.substring(0, resX.lastIndex) + "\n" + resY.substring(0, resY.lastIndex))
}
