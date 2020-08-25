package data_classes_collection.collection.maps

//yakni sebuah collection yang dapat menyimpan data dengan format key-value.
fun main() {
    val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
    )

    //panggil sebuah nilai
    println(capital["Jakarta"]) //null jika kosong
    println(capital.getValue("London")) //exception jika kosong

    //tampilkan semua keys
    val key = capital.keys
    println(key)
    //tampilkan semua values
    val value = capital.values
    println(value)

    //menggunakan mutable collection itu tidak disarankan
    //pabila terdapat sebuah mutable collection yang diubah oleh lebih dari 1 proses, hasil nya akan sulit untuk diprediksi.
    //mutable utk edit nilai maps
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital)
}