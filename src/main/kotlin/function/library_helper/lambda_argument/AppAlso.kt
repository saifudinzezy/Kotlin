package function.library_helper.lambda_argument

fun main(){
    //Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks objek
    //Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya.
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}