package oop.modifiers

fun main(){
    //Hak akses protected digunakan ketika kita menginginkan sebuah anggota dari induk kelas
    //dapat diakses hanya oleh kelas yang merupakan turunannya
    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
    //kita tidak dapat mengakses properti tersebut secara langsung dari luar hirarki kelasnya
    //println("Berat Kucing: ${cat.weight}") //Cannot access 'weight': it is protected in 'Cat'
}


open class Animall(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animall(pName, pWeight)