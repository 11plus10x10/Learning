fun main() {
    val str = readLine()!!.toLowerCase()
    when ("the" in str) {
        true -> println(str.indexOf("the"))
        false -> println(-1)
    }
}
