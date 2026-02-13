package oop_133508_ArdifaRizkySaputra.week02

import java.util.Scanner

class Loan (
    val bookTitle: String,   // Tambahkan val
    val borrower: String,    // Tambahkan val
    val loanDuration: Int = 1 // Tambahkan val
) {
    fun calculateFine() {
        if(loanDuration > 3){
            val denda = (loanDuration - 3) * 2000
            println("Total denda kamu adalah Rp. $denda")
        } else {
            val denda = 0
            println("Total denda kamu adalah Rp. $denda")
        }
    }
}

fun main(){
    val scanner = Scanner(System.`in`)
    print("Masukkan Judul Buku")
    val bookTitle = scanner.nextLine()
    print("Masukkan Nama Peminjam")
    val borrower = scanner.nextLine()
    print("Masukkan Lama Pinjam Buku")
    val loanDuration = scanner.nextInt()
    if (loanDuration < 0) {
        println("WARNING: Durasi tidak valid, diatur otomatis ke 1 hari.")
        val loanDuration = 1
    }
    val pinjaman = Loan(bookTitle, borrower, loanDuration)
    println("\n--- DETAIL PEMINJAMAN BUKU GACOR ---")
    println("Judul Buku  : ${pinjaman.bookTitle}")
    println("Peminjam    : ${pinjaman.borrower}")
    println("Lama Pinjam : ${pinjaman.loanDuration} hari")
    pinjaman.calculateFine()
}