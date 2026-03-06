package oop_133508_ArdifaRizkySaputra.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}