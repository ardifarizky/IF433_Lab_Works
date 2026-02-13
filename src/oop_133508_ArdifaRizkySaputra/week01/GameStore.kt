package oop_133508_ArdifaRizkySaputra.week01

fun main() {
    val gameTitle = "Persona 4 Golden"
    val price = 240000
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.20).toInt() else (price * 0.10).toInt()