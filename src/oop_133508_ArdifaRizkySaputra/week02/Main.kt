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

    print("Pilih Jalur(1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(name, nim)
        println("Terdaftar di : ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihanmu nguawor cik, pendaftaran batal!")
    }
}