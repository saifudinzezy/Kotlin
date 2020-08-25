package data_classes_collection.collection.list

fun main(){
    //immutable = const/val list nilai tidak bsa diubah
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
    val anyList = listOf('a', "Kotlin", 3, true)
    println(anyList[3])

    //mutable
    val anyListMutable = mutableListOf('a', "Kotlin", 3, true)
    anyListMutable.add('d') // menambah item di akhir list
    anyListMutable.add(1, "love") // menambah item pada indeks ke-1
    anyListMutable[3] = false // mengubah nilai item pada indeks ke-3
    anyListMutable.removeAt(1) // menghapus item User() berdasarkan index atau posisi nilai di dalam Array
    println(anyListMutable)
}