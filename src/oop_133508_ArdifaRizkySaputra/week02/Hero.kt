package oop_133508_ArdifaRizkySaputra.week02

class Hero(
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
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