package oop.property_delegation.constraint_type_param

fun main() {
    //val numbers = ListNumber<Long>()

    //numbers.sumNumber()
    val names = listOf("dicoding", "academy")
    //names.sumNumber() // error : inferred type String is not a subtype of Number
}

//membatasi tipe apa saja yang dapat digunakan sebagai parameter.
//dengan menambahkan tanda titik dua (:)
//Number sebagai batasan tipe argumen.
/*class ListNumber<T : Number> : List<T> {
    override fun get(index: Int): T {
    }
}*/

//merupakan extensions function dari kelas List yang mempunyai tipe parameter.
//Sama seperti deklarasi generic pada sebuah fungsi, tipe parameter T pada
//fungsi tersebut juga akan digunakan sebagai receiver dan return type.
//Perbedaannya terletak pada cara memanggilnya.
/*
fun <T : Number> List<T>.sumNumber() : T {

}*/
