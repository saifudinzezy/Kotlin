package function.recursion

fun main(){
    //recursion
    //gunakan untuk menyederhanakan pemecahan masalah yang umumnya diselesaikan dengan cara yang kompleks.
    println("Factorial 9999 is: ${factorial(9999)}")

    //Tail Call Recursion
    //Tail recursion akan memastikan proses sebelumnya telah selesai
    //sebelum pemanggilan fungsi berikutnya dijalankan
    println("Factorial 9999 is: ${factorial(9999, 1)}")
}

//recursion
fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}

//fungsi tersebut hanya boleh dipanggil untuk dijalankan terakhir dan tidak boleh digunakan dari dalam blok try-catch-finally.
tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}