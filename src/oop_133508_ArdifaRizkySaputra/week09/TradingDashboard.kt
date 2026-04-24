package oop_133508_ArdifaRizkySaputra.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG",  20,  15.5,  "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10,  -5.2,  "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15,  8.3,   "CLOSED"),
        TradeLog("SOLUSDT", "LONG",  25,  -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG",  10,  22.1,  "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 5,   3.7,   "CLOSED"),
        TradeLog("BTCUSDT", "LONG",  30,  9.9,   "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 20,  -2.5,  "OPEN")
    )

    val closedTrades  = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades  = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    println("\n--- TOP PERFORMERS (WIN) ---")
    topPerformersString.forEach { println(it) }
}