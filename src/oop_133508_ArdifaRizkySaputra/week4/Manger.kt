package oop_133508_ArdifaRizkySaputra.week4

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) { // Chaining ke constructor Employee

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}