package oop.`class`

/*Sama seperti variabel, kita bisa gunakan val atau var,
dilanjutkan dengan nama objek yang akan anda buat.
Tanda = menunjukan bahwa kita akan menginisialisasi suatu objek,
kemudian diikuti dengan nama kelas dan tanda kurung.
Tanda kurung tersebut menunjukan bahwa kita membuat sebuah objek baru.
Di dalam tanda kurung kita dapat menambahkan nilai properti sesuai yang
dibutuhkan pada primary constructor kelasnya.*/
fun main(){
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2,true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()
}

private class Animal(
        val name: String,
        val weight: Double,
        val age: Int,
        val isMammal: Boolean
){
    fun eat(){
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}