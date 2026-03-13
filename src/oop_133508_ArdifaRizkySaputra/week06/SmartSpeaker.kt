package oop_133508_ArdifaRizkySaputra.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker '$name' aktif. Siap menerima perintah suara")
    }

    override fun turnOff() {
        println("Smart Speaker '$name' dinonaktifkan. Mode hemat daya dimulai")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify melalui speaker $name")
    }
}