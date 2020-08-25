package data_classes_collection.collection.set

//Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik
fun main(){
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    //Selain itu urutan pada Set bukanlah sesuatu yang penting, sehingga apabila
    //kita bandingkan dua buah Set yang memiliki nilai yang sama dan urutan yang berbeda, akan tetap dianggap sama.
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)

    //pengecekan apakah sebuah nilai ada di dalam Set dengan menggunakan kata kunci in
    println(2 in setA)

    //ada juga fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 (dua) buah Set
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    //Set kita bisa menambah dan menghapus item namun tak bisa mengubah nilai seperti pada List.
    var mutableSet = integerSet.toMutableSet()
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
}