package signature

fun nameToAscii(name: String): MutableList<String> {
    // Returns ASCII art
    val alphabet = mapOf(
            'a' to arrayOf("____", "|__|", "|  |"),
            'b' to arrayOf("___ ", "|__]", "|__]"),
            'c' to arrayOf("____", "|   ", "|___"),
            'd' to arrayOf("___ ", """|  \""", """|__/"""),
            'e' to arrayOf("____", "|___", "|___"),
            'f' to arrayOf("____", "|___", "|   "),
            'g' to arrayOf("____", "| __", "|__]"),
            'h' to arrayOf("_  _", "|__|", "|  |"),
            'i' to arrayOf("_", "|", "|"),
            'j' to arrayOf(" _", " |", "_|"),
            'k' to arrayOf("_  _", """|_/ """, """| \_"""),
            'l' to arrayOf("_   ", "|   ", "|___"),
            'm' to arrayOf("_  _", """|\/|""", "|  |"),
            'n' to arrayOf("_  _", """|\ |""", """| \|"""),
            'o' to arrayOf("____", "|  |", "|__|"),
            'p' to arrayOf("___ ", "|__]", "|   "),
            'q' to arrayOf("____", "|  |", """|_\|"""),
            'r' to arrayOf("____", """|__/""", """|  \"""),
            's' to arrayOf("____", "[__ ", "___]"),
            't' to arrayOf("___", " | ", " | "),
            'u' to arrayOf("_  _", "|  |", "|__|"),
            'v' to arrayOf("_  _", "|  |", """ \/ """),
            'w' to arrayOf("_ _ _", "| | |", "|_|_|"),
            'x' to arrayOf("_  _", """ \/ """, """_/\_"""),
            'y' to arrayOf("_   _", """ \_/ """, "  |  "),
            'z' to arrayOf("___ ", """  / """, """ /__"""),
            ' ' to arrayOf("    ", "    ", "    ")
    )
    val result = mutableListOf("", "", "")

    for (str in result.indices) {
        for (char in name) {
            if (char in alphabet) {
                result[str] += alphabet[char]?.get(str).toString() + " "
            }
        }
    }
    return result
}

fun generateOutput(name: MutableList<String>, status: String) {
    // ASCII + lines made with *
    // Find length of the longest string in name
    var length = name.first().length
    for (str in 1..2) {
        if (name[str].length > length) length = name[str].length
    }

    // Checking status length
    if (length < status.length) length = status.length

    // First line
    repeat(length + 5) {
        print('*')
    }
    println()

    // ASCII name
    for (str in name) println("*  $str *")

    // Determine status placement
    val spaces = IntArray(2)
    if ((length - status.length) % 2 == 0) {
        spaces[0] = (length - status.length) / 2
        spaces[1] = spaces[0] + 3
    } else {
        spaces[0] =  (length - status.length - 1) / 2
        spaces[1] = spaces[0] + 1 + 3
    }

    // Status printing
    print("*")
    repeat(spaces[0]) {
        print(" ")
    }
    print(status)
    repeat(spaces[1]) {
        print(" ")
    }
    print("*\n")

    // Last line
    repeat(length + 5) {
        print('*')
    }

//    for (i in str) println("*  $i *")
//    var spacesLeft = ""
//    var spacesRight = ""
//    repeat((lengthMax - status.length) / 2) {
//        spacesLeft += " "
//    }
//    repeat((lengthMax - status.length) / 2) {
//        spacesRight += " "
//    }
//    println("* $spacesLeft$status$spacesRight *")
//    repeat(lengthMax + 5) {
//        print("*")
//    }

}

fun main() {
    // input
    val name = readLine()!!
    val status = readLine()!!
    val ascii = nameToAscii(name.toLowerCase())

    println("Enter name and surname: $name")
    println("Enter person's status: $status")
    generateOutput(ascii, status)
}
