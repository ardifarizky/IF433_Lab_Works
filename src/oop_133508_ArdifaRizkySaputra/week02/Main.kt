package oop_133508_ArdifaRizkySaputra.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 6 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 6) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 6 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}