package oop.ext_properties

fun main(){
    //Extension properties pada Kotlin sama halnya seperti melakukannya pada Extension function.
    //Kita dapat menambahkan sebuah properti tanpa harus membuat sebuah kelas
    //yang mewarisi kelas tersebut.

    //Dengan demikian, Extension properties hanya bisa didefinisikan dengan
    //cara menyediakan getter dan/atau setter secara eksplisit.

    val dicodingCat = Animal("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnimalInfo)
}

class Animal(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Animal.getAnimalInfo : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"