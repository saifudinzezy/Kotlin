package function.library_helper.lambda_receiver

fun main(){
    //Pada dasarnya fungsi with bukanlah sebuah extension melainkan hanyalah fungsi biasa
    //Fungsi with sendiri disarankan untuk mengakses apa yang menjadi anggotanya tanpa harus
    //menyediakan nilai kembalian.
    val message = "Hello Kotlin!"
    val result = with(message){
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result)
}