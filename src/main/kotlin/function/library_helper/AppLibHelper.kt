package function.library_helper

fun main() {
    //Lambda receiver (this)
    //run, with, dan apply
    //ditujukan untuk operasi objek itu sendiri, seperti memanggil fungsi dan
    //inisialisasi nilai dari anggota yang menjadi bagian dari objek tersebut
    val buildString = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }

    //Lambda argument (it)
    //fungsi yang menggunakan lambda argument untuk mengakses konteks dari sebuah objek adalah fungsi let dan also
    //nilai dari argumen tersebut dapat kita gunakan untuk diproduksi atau di inisialisasikan untuk variabel lain
    //default argument it
    val text = "Saifudin"
    text.let {
        println("Hello $it")
    }

    text.let { value ->
        val message = "$value Kotlin"
        println(message)
    }
}