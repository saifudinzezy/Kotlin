package oop.property_delegation.fungsi

fun main(){
    val numbers = (1..100).toList()
    //
    print(numbers.slice<Int>(1..10))
    //jika semua nilai yang berada di dalamnya memiliki tipe yang sama
    print(numbers.slice(1..10))
}

//Tipe parameter yang berada di dalam angle bracket harus ditempatkan sebelum
//nama dari fungsi yang kita tentukan.
/*fun <T> run(): T{
    return T
}*/

//Tipe parameter pada fungsi slice() di atas digunakan sebagai receiver dan return type.
/*
public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {

}*/
