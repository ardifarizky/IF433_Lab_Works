package oop_133508_ArdifaRizkySaputra.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun search(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}