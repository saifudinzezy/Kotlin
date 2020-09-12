package oop.abstrac

fun main(){
    //Dengan begitu kelas Animal tidak dapat kita inisialisasikan menjadi sebuah objek.
    //val animal = Animal("dicoding animal", 2.6, 1, true)
}

//abstract merupakan gambaran umum dari sebuah kelas. Ia tidak dapat direalisasikan dalam sebuah objek.
abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}