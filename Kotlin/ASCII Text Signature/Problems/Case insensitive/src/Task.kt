import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val str1 = scanner.nextLine().toLowerCase()
    val str2 = scanner.nextLine().toLowerCase()
    println(str1 == str2)
}
