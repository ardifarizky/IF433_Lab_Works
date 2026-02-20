package oop_133508_ArdifaRizkySaputra.week03

fun main() {
    println("--- Practice Week 03 ---")
    val e = Employee("Budi")

    e.salary = -5000
    e.salary = 500000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
    println("")

    println("--- Tugas Week 03 ---")
    val myWeapon = Weapon("Pak Darman Legendary Sword")
    println("Senjata Pilihan: ${myWeapon.name}")

    println("Mencoba set damage ke -67")
    myWeapon.damage = -67
    println("Damage saat ini: ${myWeapon.damage}")
    println("")

    println("Mencoba set damage ke 9999")
    myWeapon.damage = 9999
    println("Damage saat ini: ${myWeapon.damage}")
    println("")

    println("Tier Senjata: ${myWeapon.tier}")

}