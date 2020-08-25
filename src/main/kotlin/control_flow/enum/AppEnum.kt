package control_flow.enum

/*Enumeration merupakan salah satu fitur yang bisa kita gunakan untuk menyimpan kumpulan objek
yang telah didefinisikan menjadi tipe data konstanta*/
fun main() {
    val colorRed = Color.RED
    val colorReds = Colors.RED
    println(colorReds)

    //synthetic method yang memungkinkan kita mendapatkan daftar objek Enum
    //dan nama dari tiap Enum itu sendiri.
    //Untuk mendapatkan daftar objek Enum kita bisa menggunakan fungsi values() atau enumValues().
    //Sedangkan untuk mendapatkan nama dari objek Enum kita bisa menggunakan fungsi valueOf() atau enumValueOf()
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print(color)
    }

    //kita juga bisa mendapatkan posisi tiap objek menggunakan properti ordinal
    print("Position GREEN is ${colorRed.ordinal}")

    //mengecek instance dari enum
    when(colorRed){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}

enum class Color(val value: Int) {
    //dapat mendeklarasikan anonymous class untuk setiap objek Enum
    RED(0xFF0000) {
        override fun printValue() {
            TODO("Not yet implemented")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            TODO("Not yet implemented")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            TODO("Not yet implemented")
        }
    };

    abstract fun printValue()
}

enum class Colors() {
    RED, GREEN, BLUE
}