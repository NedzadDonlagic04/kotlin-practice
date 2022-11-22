fun main() {
    print("Enter your name: ")
    val userName = readln().toString()

    print("Enter your surname: ")
    val userSurname = readln().toString()

    print("Enter your age: ")
    val userAge = readln().toInt()

    println("Hello $userName $userSurname, who is $userAge years old!")
}