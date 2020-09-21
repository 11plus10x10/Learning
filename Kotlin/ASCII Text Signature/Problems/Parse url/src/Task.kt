fun main() {
    var url = readLine()!!.split('?')
    url = url[1].split('&')
    var pass = emptyList<String>()
    for (i in url) {
        if (i.substring(0..3) == "pass") {
            pass = i.split('=')
        }
    }
    for (i in url) {
        val j = i.split('=')
        if (j[1] != "") println("${j[0]} : ${j[1]}") else println("${j[0]} : not found")
    }
    if (pass.isNotEmpty()) println("password : ${pass[1]}")
}
