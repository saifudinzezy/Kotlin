package forlop

/*For dapat digunakan pada Ranges, Collections, Arrays dan apapun yang menyediakan iterator*/
fun main(){
    val range = 1.rangeTo(10) step 3
    for (i in range){
        println("value is $i!")
    }

    //Kita juga dapat mengakses indeks untuk setiap elemen yang ada pada Ranges
    //dengan memanfaatkan fungsi withIndex()
    for ((index, value ) in range.withIndex()){
        println("value $value with index $index")
    }

    //ekstensi pada Kotlin yaitu forEach
    //memiliki satu argumen yaitu nilai tunggal
    range.forEach { value ->
        println("foreach value is $value!")
    }

    //Jika kita mendapatkan indeks dari tiap nilai yang dicakup kita bisa menggunakan ekstensi forEachIndexed
    //memiliki dua argumen. Pertama adalah index yang merupakan indeks dari tiap nilai.
    //Kedua adalah value yang merupakan nilai tunggal yang dicakup oleh ranges itu sendiri.
    range.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

    //jika kita hanya ingin menggunakan argumen index, maka kita bisa mengubah argumen value menjadi _
    //Sebenarnya ini merupakan sebuah aturan di mana ketika argumen dari sebuah lambda expression
    //tidak digunakan, kita disarankan agar mengubahnya menjadi _ untuk menggantikan nama dari
    //argumen tersebut
    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}
