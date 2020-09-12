package oop.constructor

fun main(){
    val dicodingCat = AnimalDefault()
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}

//default constructor
//Konstruktor tersebut akan menginisialisasi properti yang terdapat pada kelas dengan nilai default.
private class AnimalDefault{
    val name: String = "Dicoding Miaw"
    val weight: Double = 4.2
    val age: Int = 2
    val isMammal: Boolean = true
}