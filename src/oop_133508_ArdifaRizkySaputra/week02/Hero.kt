package oop_133508_ArdifaRizkySaputra.week02

import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100,
    ) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }
    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
        println("$name menerima $damage damage! HP tersisa: $hp")
    }
    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Masukkan Nama Hero Kamu: ")
    val heroName = scanner.nextLine()
    print("Masukkan Stat Damage: ")
    val baseDamage = scanner.nextInt()
    val player = Hero(heroName, baseDamage)
    var enemyHp = 67
    while (player.isAlive() && enemyHp > 0) {
        println("\n--- STATUS ---")
        println("${player.name} (HP: ${player.hp}) VS Musuh (HP: $enemyHp)")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilih aksi: ")
        when (scanner.nextInt()) {
            1 -> {
                enemyHp -= player.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP Musuh sisa: $enemyHp")
                if (enemyHp > 0) {
                    println("Musuh menyerang balik!")
                    val enemyDamage = (10..20).random()
                    player.takeDamage(enemyDamage)
                }
            }
            2 -> {
                println("\n$heroName memilih kabur... Cupu bener cik!")
                break
            }
            else -> println("Pilihan tidak valid, kamu bengong dan melewatkan giliran!")
        }
    }
    println("Hasil Pertarungan")
    if (enemyHp <= 0) {
        println("Selamat! Musuh berhasil dikalahkan")
    } else if (!player.isAlive()) {
        println("Waduh, ${player.name} tewas mengenaskan :(")
    } else {
        println("${player.name} berhasil melarikan diri dengan selamat, cupu banget bro.")
    }
}