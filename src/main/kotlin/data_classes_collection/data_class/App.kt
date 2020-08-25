package data_classes_collection.data_class

/*Data class adalah sebuah kelas yang tidak memiliki logika apapun dan juga tidak memiliki
fungsionalitas lain selain menangani data.*/

/*Beberapa hal yang perlu diperhatikan dalam membuat sebuah data class adalah:
1. Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter;
2. Semua konstruktor utama perlu dideklarasikan sebagai val atau var;
3. Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.*/

class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)
data class DataUsers(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    // menyalin sebuah objek
    val dataUser4 = dataUser.copy()
    //ubah nilai awal
    val dataUser5 = dataUser.copy(age = 18)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    println(dataUser4)

    //akses nilai
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")

    //add behavior
    val dataUsers = DataUsers("nrohmen", 23)
    dataUsers.intro()
}