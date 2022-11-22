fun zbir(a : Int, b : Int) : Int {
    return a + b
}

fun main() {
    print("Enter a: ")
    val a = readln().toInt()

    print("Enter b: ")
    val b = readln().toInt()

    val result = zbir(a, b)

    println("$a + $b = $result")
}