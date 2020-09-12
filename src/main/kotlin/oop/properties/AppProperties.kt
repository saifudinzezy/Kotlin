package oop.properties

fun main() {
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}

private class Animal {
    var name: String = "Dicoding Miaw"
        //ita perlu mengembalikan nilai sesuai tipe data dari propertinya atau
        //kita dapat mengembalikan nilai dari properti itu sendiri dengan menggunakan keyword field
        get() {
            println("Fungsi Getter terpanggil")
            return field
        }

        //kita memerlukan sebuah parameter. Ini merupakan sebuah nilai baru yang nantinya akan
        //dijadikan nilai properti. Pada kode di atas parameter tersebut ditetapkan dengan nama value.
        set(value) {
            println("Fungsi Setter terpanggil")
            field = value
        }
}