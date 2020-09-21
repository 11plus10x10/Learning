fun main() {
    val input = readLine()!!
    loop@ for (i in 'a'..'z') {
        if (i in input) break@loop else print(i)
    }
}
