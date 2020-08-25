package array

fun main(){
    /*intArrayOf() : IntArray
    booleanArrayOf() : BooleanArray
    charArrayOf() : CharArray
    longArrayOf() : LongArray
    shortArrayOf() : ShortArray
    byteArrayOf() : ByteArray*/
    //semua array = any
    val array = arrayOf(1, 3, "hello")
    //int array
    val intArray = intArrayOf(1, 3, 5)
    val intArr = Array(4, { i -> i * i }) // [0, 1, 4, 9]

    print(intArr[2])
}