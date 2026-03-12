package oop_133508_ArdifaRizkySaputra.week05

fun main() {
    val dosen1 = Dosen("Pak Webe", "676767")
    val admin1 = Admin("Bu Yuli")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("Terdeteksi sebagai dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("----")
    }
    val mathHelper = MathHelper()
    println(mathHelper.hitungLuas(67))
    println(mathHelper.hitungLuas(6, 7))
    println(mathHelper.hitungLuas(6.7))

    println("----")

    val dompetDipa = EWallet(50000.0)
    val kreditDipa = CreditCard(100000.0, 0.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(dompetDipa, kreditDipa)

    val jumlahBayar = 75000.0
    println("Memproses pembayaran sebesar: $jumlahBayar")
    println("------------------------------------------")

    for (metode in daftarPembayaran) {
        metode.processPayment(jumlahBayar)
}