package function.advanced_collection.fold

fun main() {
    //melakukan perhitungan setiap nilai yang berada di dalam sebuah collection
    //tanpa harus melakukan iterasi item tersebut satu-persatu
    val number = listOf(4, 3)
    val fold = number.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

    //fungsi foldRight() akan melakukan proses iterasi dari indeks terakhir dan
    //posisi dari argumen pada lambda expression nya pun berbeda,
    val folsd = number.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }
    println("Fold result: $folsd")
}