fun main() {
    val ticket: List<Char> = readLine()!!.toList()
    if (ticket[0].toInt() + ticket[1].toInt() + ticket[2].toInt() ==
            ticket[3].toInt() + ticket[4].toInt() + ticket[5].toInt()) {
        println("Lucky")
    } else {
        println("Regular")
    }
}
