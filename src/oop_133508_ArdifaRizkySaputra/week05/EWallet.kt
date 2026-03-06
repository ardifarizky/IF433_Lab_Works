package oop_133508_ArdifaRizkySaputra.week05

class EWallet (var balance: Double) : PaymentMethod("QRIS") {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran Berhasil!")
        } else {
            println("Saldo tidak cukup.")
        }
    }
    fun topUp (amount: Double) {
        if (amount > 0) {
            balance += amount
        } else {
            println("Amount harus lebih dari 0")
        }
    }
}