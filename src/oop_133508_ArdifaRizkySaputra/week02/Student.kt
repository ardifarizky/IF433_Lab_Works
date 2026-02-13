package oop_133508_ArdifaRizkySaputra.week02

class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
){
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }

    init {
        if (nim.length != 6) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}