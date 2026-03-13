package oop_133508_ArdifaRizkySaputra.week06

fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai Checkout...")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\nTesting Checkout")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    println("\nSmart Home")
    val mySmartHome = SmartHomeHub()
    val lampuTamu = SmartLamp("L-001", "Ruang Tamu")
    val googleNest = SmartSpeaker("S-002", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("C-003", "Ezviz Garasi")
    mySmartHome.addDevice(lampuTamu)
    mySmartHome.addDevice(googleNest)
    mySmartHome.addDevice(cctvGarasi)
    mySmartHome.activateSecurityMode()
    mySmartHome.turnOffAllSwitches()
}