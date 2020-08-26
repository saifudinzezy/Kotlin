package function.library_helper.lambda_receiver

fun main(){
    //dikembalian dari fungsi apply adalah nilai dari konteks objeknya dan
    //objek konteksnya tersedia sebagai receiver (this).
    //Baiknya fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya

    //non apply
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")

    println(builder.toString())

    //apply
    val message = StringBuilder().apply {
        //konfigurasi dari receivernya
        append("Hello ")
        append("Kotlin")
    }

    println(message)
}