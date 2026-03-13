package oop_133508_ArdifaRizkySaputra.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil dikirim")
    }
}