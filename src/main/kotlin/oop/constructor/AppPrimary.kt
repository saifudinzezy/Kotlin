package oop.constructor

fun main(){
    //bisa eksplisit memilih properti yang ingin kita berikan nilai
    val dicodingCat = Animal("Dicoding Miaw", weight = 4.2)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}

//bisa menambahkan default value diprimary constructor
private class Animal(
        var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true
)

//init di sini memiliki beberapa fungsi selain menginisialisasi properti kelas.
//satu fungsi lainnya adalah untuk membantu dalam memvalidasi sebuah nilai properti sebelum diinisialisasi.
private class Animals(
        name: String, weight: Double, age: Int, isMammal: Boolean
){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    //blok init yang memungkinkan kita untuk menuliskan properti di dalam body class
    //ketika kita menggunakan primary constructor
    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}