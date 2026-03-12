package oop_133508_ArdifaRizkySaputra.week05

class CreditCard (val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod("QRIS") {
    override fun processPayment(amount: Double) {
        if ((usedAmount + amount) < limit) {
            usedAmount += amount
            println("Transaksi berhasil!")
        } else {
            println("Kartu kredit anda sudah limit, transaksi ditolak, silahkan pinjam ke pinjol")
        }
    }
}

