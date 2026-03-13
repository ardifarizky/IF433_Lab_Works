package oop_133508_ArdifaRizkySaputra.week06

fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai Checkout...")
    method.pay(amount)
}

fun Main {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\nTesting Checkout")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}