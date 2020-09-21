import java.util.Scanner

fun countDuplicates(array: IntArray, value: Int): Boolean {
    var count = 0
    for (index in array.indices) if (array[index] == value) ++count
    return count > 1
}

fun main() {
    val scanner = Scanner(System.`in`)
    val companiesNum = scanner.nextInt()
    val incomes = IntArray(companiesNum)
    for (index in incomes.indices) incomes[index] = scanner.nextInt()
    val taxRates = IntArray(companiesNum)
    for (index in taxRates.indices) taxRates[index] = scanner.nextInt()
    val payments = IntArray(companiesNum)
    val res = IntArray(4) // 0_maxPayment, 1_maxIndex, 2_minPayment, 3_minIndex
    for (index in payments.indices) payments[index] = incomes[index] * taxRates[index]
    res[0] = payments.max()!!
    res[2] = incomes[0]
    for (index in payments.indices) if (payments[index] < res[2] && payments[index] > 0) res[2] = payments[index]
    for (index in payments.indices) {
        when {
            payments[index] == res[0] -> res[1] = index + 1
            payments[index] == res[2] -> res[3] = index + 1
        }
    }
    if (countDuplicates(payments, res[0])) println(res[3]) else println(res[1])
}
