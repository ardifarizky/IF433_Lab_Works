package oop_133508_ArdifaRizkySaputra.week01

fun main() {
    val gameTitle = "Persona 4 Golden"
    val price = 240000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.20).toInt() else (price * 0.10).toInt()

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("Game : $title")
    println("Total Harga : Rp $finalPrice")
    println("Note : ${note ?: "Tidak ada catatan"}")
}