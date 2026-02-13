package oop_001_johnthor.week01

fun main(args: Array<String>) {
    // Variable definition
    val radius = 7.0
    val pi = 3.14
    // Calculation
    val area: Double = pi * radius * radius
    // Output Concatenation
    println("Radius: $radius" + ", Area: $area")
    // Logic check
    checkSize(area)
}
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"