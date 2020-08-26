package function.library_helper.lambda_receiver

fun main(){
    //run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
    //Untuk mengakses konteks dari objek, ia akan menggunakan receiver (this).
    //Fungsi run akan sangat berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian
    val text = "Hello"
    val result = text.run {
        val from = this //Hello
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }

    println("result : $result")
}