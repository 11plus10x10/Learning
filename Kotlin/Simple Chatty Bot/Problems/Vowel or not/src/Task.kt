import java.util.Scanner

fun isVowel(letter: Char): Boolean {
    if (letter.toLowerCase() == 'a') {
        return true
    } else if (letter.toLowerCase() == 'e') {
        return true
    } else if (letter.toLowerCase() == 'i') {
        return true
    } else if (letter.toLowerCase() == 'o') {
        return true
    } else if (letter.toLowerCase() == 'u') {
        return true
    } else {
        return false
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}