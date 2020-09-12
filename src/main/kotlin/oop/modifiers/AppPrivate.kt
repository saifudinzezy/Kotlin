package oop.modifiers

fun main(){
    //val dicodingCat = Animal("Dicoding Miaw", 2.5, 2)
    //println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.getName()}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}

//hak akses private, maka anggota tersebut tidak dapat diakses dari luar scope-nya.
//solusinya kita haru membuat getter dan setter
class Animal(private val name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean){
    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        //name = newName
    }
}
