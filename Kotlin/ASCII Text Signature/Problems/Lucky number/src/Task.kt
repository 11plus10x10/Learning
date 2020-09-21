fun main() {
    val input = readLine()!!
    println(when (input.substring(0 until input.length / 2).sumBy { Character.getNumericValue(it) } ==
            input.substring(input.length / 2..input.lastIndex).sumBy { Character.getNumericValue(it) }) {
        true -> "YES"
        false -> "NO"
    })
}
