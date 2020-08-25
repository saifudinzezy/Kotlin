package control_flow.range

/*Range direpresentasikan dengan operator .. atau dengan fungsi rangeTo() dan downTo().*/
//Range pada Kotlin mendukung beberapa tipe integral seperti IntRange, LongRange dan CharRange.
fun main(){
    val rangeInt = 1..10 //1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    val rangeIntt = 1.rangeTo(10) //1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    val downInt = 10.downTo(1) //10, 9, 8, 7, 6, 5, 4, 3, 2, 1

    //arak antara dua nilai yang dicakup, ditentukan oleh step, default = 1
    println(rangeInt.step)

    //untuk mengubah nilai dari step bisa dilakukan ketika kita menginisialisasi nilai yang dicakup Range
    val  rangeInts = 1..10 step 2 //1, 3, 5, 7, 9
    rangeInts.forEach {
        print("$it ")
    }
    println(rangeInts.step)

    //mengecek nilai range ada dengan in
    if (7 in downInt){
        println("Value 7 available")
    }

    if (11 !in downInt) {
        println("No value 11 in Range ")
    }
}
