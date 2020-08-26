package function.lambda.higher_order_function

fun main() {
    //Higher-Order Function, yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter,
    //menjadikan tipe kembalian, ataupun keduanya.
    //Yang perlu diperhatikan adalah, jika argumen terakhir dari fungsi merupakan sebuah lambda expression,
    //maka lambda expression tersebut ditempatkan di luar parenthesis
    printResult(10, sums())
    printResult(10) {
        //parenthesis
        value ->
        value + value
    }
}

fun printResult(value: Int, sums: (Int) -> Int) {
    val result = sums(value)
    println(result)
}

//khususnya jika ingin ditetapkan agar dapat mengembalikan nilai,
//terkadang kompiler tidak dapat menentukan tipenya
//fungsi tersebut memiliki 1 (satu) parameter dengan tipe kembalian Int. 
fun sums(): (Int) -> Int = { value -> value + value }