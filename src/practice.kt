fun main() {
// Prints a message to request input
println("Enter any two numbers to sum: ")
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()

// Prints a message with the input
print("result: ")
print(sum(firstNumber, secondNumber))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}