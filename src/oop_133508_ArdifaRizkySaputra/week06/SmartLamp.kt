package oop_133508_ArdifaRizkySaputra.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu Pintar '$name' (ID: $id) sekarang menyala. Ruangan menjadi terang!")
    }

    override fun turnOff() {
        println("Lampu Pintar '$name' (ID: $id) telah dimatikan. Sampai jumpa!")
    }
}