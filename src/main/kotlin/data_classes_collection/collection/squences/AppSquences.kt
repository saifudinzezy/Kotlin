package data_classes_collection.collection.squences

fun main() {
    val list = (1..1000000).toList()
    // lazy evaluation
    //Untuk menerapkan lazy  atau vertical evaluation maka kita perlu mengubah list menjadi Sequence
    //Karena tidak memenuhi kondisi pada filter maka operasi tidak akan dilanjutkan ke map().
    list.asSequence().filter { it % 5 == 0 }.map { it + it }.forEach { println(it) }

    //membuat objek Sequence
    //Fungsi generateSequence() akan membuat collection sequence secara tak terbatas.
    //Alhasil, kita perlu menambahkan fungsi take() supaya program tidak mengalami infinite loop.
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}