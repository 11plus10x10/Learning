fun main() {
    val word = readLine()!!
    for (letter in 'a'..'z') {
        if (letter !in word) {
            print(letter)
        }
    }
}
