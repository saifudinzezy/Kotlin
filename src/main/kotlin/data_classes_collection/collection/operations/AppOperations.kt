package data_classes_collection.collection.operations

fun main() {
    //fungsi filter() dan filterNot() Kedua fungsi tersebut akan menghasilkan list baru
    //dari seleksi berdasarkan kondisi yang kita berikan. filter mencari data yang sama
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    //it akan merepresentasikan masing masing item
    val evenList = numberList.filter { it % 2 == 0 } //[2, 4, 6, 8, 10]
    println(evenList)

    //map() Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari
    //collection sebelumnya
    var multiplieBy5 = numberList.map { it * 5 }
    println(multiplieBy5) //[5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

    //Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection
    println(multiplieBy5.count()) //10
    //menampilkan jumlah item pada numberList yang merupakan kelipatan dari 3
    println(multiplieBy5.count { it % 3 == 0 }) //3

    //find(), firstOrNull(), lastOrNull() Untuk mencari item pertama yang sesuai dengan kondisi yang kita tentukan,
    // return value jika kosong maka akan null,
    //akan langsung mengembalikan nilai ketika kondisi terpenuhi.
    val firstOddNumber = numberList.find { it % 2 == 1 } //1
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 } //null
    println("$firstOddNumber, $firstOrNullNumber")

    //fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection
    val moreThan10 = numberList.first { it > 1 }
    //print(moreThan10)

    //fungsi sum() rata2 nilai khusus hanya bisa digunakan untuk collection yang bertipe angka.
    val total = numberList.sum()
    println(total)

    //sorted() digunakan untuk mengurutkan item yang ada di dalam collection.
    //Secara default fungsi sorted() ini akan mengurutkan data secara ascending.

    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    println(kotlinChar.sorted())
    println(kotlinChar.sortedDescending())
}