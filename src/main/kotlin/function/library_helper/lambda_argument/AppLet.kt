package function.library_helper.lambda_argument

fun main() {
    //Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek.
    //Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe non-null

    //non let
    val messagee: String? = null
    val length = messagee?.length ?: 0 * 2
    val text = "text length $length"
    println(text)

    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }

    //menjalankan logika kode jika objeknya null run dan elvis operator
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run{
        //return value dibaris terakhir
        //Karena pada baris terakhir dari blok lambda tersebut adalah fungsi println()
        //maka nilai yang akan dikembalikan adalah Unit
        val text = "message is null"
        println(text)
    }
}