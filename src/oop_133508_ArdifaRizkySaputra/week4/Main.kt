package oop_133508_ArdifaRizkySaputra.week4

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")

    val myEV = ElectricCar(brand = "Tesla Model 3", numberOfDoors = 4, batteryCapacity = 85)

    myEV.accelerate()
    myEV.honk()
    myEV.openTrunk()

    val managerKita = Manager(name = "Ardifa", baseSalary = 7000000)
    managerKita.work()
    println("Bonus Manager: Rp ${managerKita.calculateBonus()}")

    val devKita = Developer(name = "Deza", baseSalary = 5000000, programmingLanguage = "Kotlin")
    devKita.work()
    println("Bonus Developer: Rp ${devKita.calculateBonus()}")
}