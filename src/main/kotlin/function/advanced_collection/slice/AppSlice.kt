package function.advanced_collection.slice

fun main(){
    //fungsi slice() membutuhkan sebuah argumen berupa Range yang digunakan untuk menentukan posisi pertama dan
    //terakhir yang akan disaring
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)

    println(slice)
    //dengan penambahan step 2
    println(total.slice(3..6 step 2))

    //posisi yang lebih spesifik
    val index = listOf(2, 3, 5, 8)
    println(total.slice(index))
}