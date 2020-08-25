package nullable.elvis_operator

fun main(){
    //Elvis operator memungkinkan kita untuk menetapkan default value
    //atau nilai dasar jika objek bernilai null.
    val text: String? = null
    //val textLength = if (text != null) text.length else 7
    val textLength = text?.length ?: 7

    println(textLength)

    //non-null assertion (!!),
    /*non-null assertion kompiler akan mengizinkan kita untuk mengakses
    atau mengelola nilai dari sebuah objek nullable
    sangat tidak disarankan karena akan memaksa sebuah objek menjadi non-null.
    Sehingga ketika objek tersebut bernilai null, Anda tetap akan berjumpa dengan NullPointerException.*/
    val tex: String? = null
    val textLengt = tex!!.length // ready to go ???
}