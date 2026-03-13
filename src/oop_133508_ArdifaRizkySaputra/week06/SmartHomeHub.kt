package oop_133508_ArdifaRizkySaputra.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Berhasil menambahkan perangkat: ${device.name} (ID: ${device.id})")
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            } else {
                println("Perangkat '${device.name}' tidak memiliki fitur saklar")
            }
        }
    }
}