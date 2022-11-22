import kotlin.math.sqrt
import kotlin.math.round

fun pythagoranTheorem(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val a = x2 - x1
    val b = y2 - y1

    return round(sqrt(a*a + b*b))
}

fun main() {
    val x1 = 5
    val y1 = 10
    val x2 = 10
    val y2 = 20

    val distance = pythagoranTheorem(x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble())

    println("Distance between points (${x1}, $y1) and ($x2, $y2) is $distance")
}