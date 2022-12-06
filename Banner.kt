fun main() {
    val border = "<"
    val lowerborder = ">"
    printBorder(border)
    println("Happy Birthday, Jhansi!")
    printBorder(lowerborder)
}

fun printBorder(border: String) {
    repeat(23) {
        print(border)
    }
    println()
}

fun printLowerBorder(lowerborder: String) {
    repeat(23) {
        print(lowerborder)
    }
    println()
}