package oop_133508_ArdifaRizkySaputra.week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")

    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 3.2))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    println("\n--- Daftar Koin ---")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Balance: ${coin.balance}")
    }

    println("\n--- Riwayat Transaksi ---")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 250.0))
    txRepo.add(Transaction("TX002", 1000.0))
    txRepo.add(Transaction("TX003", 75.5))

    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount} USD")
    }
}