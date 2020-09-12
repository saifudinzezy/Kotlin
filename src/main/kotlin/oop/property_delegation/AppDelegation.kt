package oop.property_delegation

import kotlin.reflect.KProperty

fun main(){
    val animal = Animal()

    //setter
    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 1

    //getter
    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")
}

class Animal{
    var name : Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

//meminimalisir boilerplate dalam penulisan getter dan setter
//(jika properties menggunakan var) pada setiap kelas yang kita buat.
// kita perlu membuat sebuah kelas yang memang bertugas untuk mengatur
//atau mengelola fungsi getter dan setter untuk sebuah properti kelas.
//Teknik tersebut pada Kotlin dinamakan Delegate.
class DelegateGenericClass{
    private var value: Any = "Default"

    //getter
    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    //setter
    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}