fun main() {
    val fruits = arrayOf("Apple", "Banana", "Orange", "Pineapple")

    for(i in fruits.indices) {
        println("Fruit #${i+1}: ${fruits[i]}")
    }
}