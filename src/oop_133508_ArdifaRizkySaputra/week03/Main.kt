package oop_133508_ArdifaRizkySaputra.week03

fun main() {
    println("--- Practice Week 03 ---")
    val e = Employee("Budi")

    e.salary = -5000
    e.salary = 500000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}\n")

    println("--- Tugas Week 03 (1)---")
    val myWeapon = Weapon("Pak Darman Legendary Sword")
    println("Senjata Pilihan: ${myWeapon.name}")

    println("Mencoba set damage ke -67")
    myWeapon.damage = -67
    println("Damage saat ini: ${myWeapon.damage}\n")

    println("Mencoba set damage ke 9999")
    myWeapon.damage = 9999
    println("Damage saat ini: ${myWeapon.damage}\n")
    println("Tier Senjata: ${myWeapon.tier}\n")

    println("--- Tugas Week 03 (2)---")
    val player = Player("ArdifaGanteng123")
    println("")
    println("===== Status Awal =====")
    println("User: ${player.username}, Level: ${player.level}")
    println("\n--- Menambah 50 XP ---")
    player.addXp(50)
    println("\n--- Menambah 60 XP ---")
    player.addXp(60)
    println("\n===== Status Akhir =====")
    println("User: ${player.username}, Level: ${player.level}")
}