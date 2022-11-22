fun main() {
    println("This line doesn't have a semicolon")
    println("This line has a semicolon");
    // ^ In IntelliJ IDEA 2022.2.3 (Community Edition)
    // the semicolon is greyed out and called redundant
}