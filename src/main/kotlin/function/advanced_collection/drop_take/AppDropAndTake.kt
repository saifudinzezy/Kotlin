package function.advanced_collection.drop_take

fun main(){
    //fungsi yang bisa kita manfaatkan untuk memangkas item
    //yang berada di dalam sebuah objek collection berdasarkan jumlah yang kita tentukan
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3) //[4, 5, 6]
    //memangkas nilai dari indeks terakhir
    val dropLast = number.dropLast(3) //[1, 2, 3]

    println(drop)
    println(dropLast)

    //fungsi take() bisa kita manfaatkan untuk menyaring item yang berada di dalam sebuah objek collection.
    val take = number.take(3) //[1, 2, 3]
    val takeLast = number.takeLast(3) //[4, 5, 6]
    println(take)
    println(takeLast)
}