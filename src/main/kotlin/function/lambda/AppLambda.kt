package function.lambda

/*beberapa karakteristik dari lambda berikut:

1. Dalam menggunakan lambda, kita tidak perlu mendeklarasi tipe spesifik untuk nilai kembaliannya. Tipe tersebut akan ditentukan oleh kompiler secara otomatis.
2. Walaupun merupakan sebuah fungsi, lambda tidak membutuhkan kata kunci fun dan visibility modifier saat dideklarasikan, karena lambda bersifat anonymous.
3. Parameter yang akan ditetapkan berada di dalam kurung kurawal {}.
4. Ketika ingin mengembalikan nilai, kata kunci return tidak diperlukan lagi karena kompiler akan secara otomatis mengembalikan nilai dari dalam body.
5. Lambda expression dapat digunakan sebagai argumen untuk sebuah parameter dan dapat disimpan ke dalam sebuah variabel.*/

fun main(){
    message()
    printMessage("udin")
}

//Untuk membedakannya dengan body, daftar parameter yang ada dipisahkan dengan tanda ->
//kompiler akan mengembalikan nilai berdasarkan expression atau statement di baris terakhir di dalam body.
val message = { println("Hello From Lambda") }
val printMessage = { message: String -> println(message)}