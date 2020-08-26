package function.varag

fun main(){
    //varargkita juga bisa menyederhanakan beberapa parameter yang memiliki tipe data yang sama
    //vararg, sebuah fungsi dapat memiliki jumlah parameter berdasarkan jumlah argumen
    //yang kita masukan ketika fungsi tersebut dipanggil.
    //Lalu kapan kita membutuhkan vararg?  Ketika sebuah fungsi yang
    //menggunakannya tidak mengetahui jumlah argumen yang akan disematkan ketika fungsi tersebut dipanggil.
    //tidak boleh memiliki dua vararg, vararg sebaiknya diposisi pertama
    val number = sumNumbers(10, 20, 30, 40)
    print(number)

    val numbers = intArrayOf(10, 20, 30, 40)
    set(10, 20, 20, *numbers , 10)
}

fun sumNumbers (vararg number: Int) : Int{
    return number.sum()
}

fun set(vararg number: Int): Int {
    return number.sum()
}