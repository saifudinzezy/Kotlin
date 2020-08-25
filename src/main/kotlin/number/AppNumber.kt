package number

fun main(){
    //bilangan bulat
    //hasil operasi pembagian pada tipe data Int akan dibulatkan kebawah
    val int: Int = 2 //32 bit range -2^31 sampai +2^31-1.
    val long: Long = 20000L //64 bit range -2^63 sampai +2^63-1
    val short: Short = 10 //16 bit
    val byte: Byte = 0b11010010.toByte() //Byte biasa digunakan untuk keperluan proses  stream file atau jaringan.

    //bilangan desimal
    val double: Double = 1.3 //64 bit

    //fungsi conversi
    /*toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char*/

    //readable
    val readableNumber = 1_000_000
    print(readableNumber)
}