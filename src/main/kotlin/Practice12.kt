fun factorial(num: Int) : Int {
    var returnVal = 1
    repeat(num) {
        returnVal *= (it + 1)
    }

    return returnVal
}

fun main() {
    println("Factorial of 2: ${factorial(2)}")
    println("Factorial of 5: ${factorial(5)}")
    println("Factorial of 10: ${factorial(10)}")
    println("Factorial of -5: ${factorial(-5)}")
}