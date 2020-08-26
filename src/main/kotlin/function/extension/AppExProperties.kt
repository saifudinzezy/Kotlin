package function.extension

fun main(){
    //extension untuk menambah sebuah properti baru pada sebuah kelas tanpa harus
    //menyentuh kode di dalam kelas tersebut.
    println(10.slice)
}

//extension properties hanya bisa dideklarasikan dengan cara menyediakan getter atau setter secara eksplisit.
val Int.slice: Int
    get() = this / 2