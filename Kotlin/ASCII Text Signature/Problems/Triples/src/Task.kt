import java.util.Scanner

fun readArray(): IntArray {
    // array input
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val array = IntArray(n)
    for (index in array.indices) array[index] = scanner.nextInt()
    return array
}

fun tripletCheck(array: IntArray) {
    var result = 0
    if (array.size < 3) println(0) else {
        for (i in 0 until array.size - 2) {
            if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) ++result else continue
        }
        println(result)
    }
}

fun main() {
    val input = readArray()
    tripletCheck(input)
}
