fun main() {
    print("Enter a number: ")
    val input = readln().toInt()

    println("FizzBuzz Print:")
    for(num in 1..input) {
        if(num % 15 == 0) {
            println("FizzBuzz")
        } else if (num % 3 == 0) {
            println("Fizz")
        } else if (num % 5 == 0) {
            println("Buzz")
        } else {
            println(num)
        }
    }
}