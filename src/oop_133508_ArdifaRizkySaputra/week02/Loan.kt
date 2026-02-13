package oop_133508_ArdifaRizkySaputra.week02

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