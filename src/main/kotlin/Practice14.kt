fun main() {
    var input : Int

    do {
        print("Enter a number from 1 to 7: ")
        input = readln().toInt()
    } while(input < 1 || input > 7)

    when(input) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        else -> println("Sunday")
    }
}