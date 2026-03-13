package oop_133508_ArdifaRizkySaputra.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("Smart CCTV '$name' (ID: $id) diaktifkan")
        // Memanggil fungsi startRecord secara otomatis saat dinyalakan
        startRecord()
    }

    override fun turnOff() {
        // Praktik terbaik: Matikan rekaman sebelum perangkat benar-benar mati
        stopRecord()
        println("Smart CCTV '$name' dimatikan. Koneksi terputus")
    }

    override fun startRecord() {
        println("Sistem keamanan '$name' sedang merekam ke Cloud Storage...")
    }
}