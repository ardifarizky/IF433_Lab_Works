package oop_133508_ArdifaRizkySaputra.week01

fun main() {
    var name: String = "Ardifa"
    var score: Int = 88

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}