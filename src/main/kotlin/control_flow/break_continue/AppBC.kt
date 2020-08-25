package control_flow.break_continue

/*Continue digunakan untuk melewatkan proses iterasi dan lanjut dengan proses iterasi berikutnya.
Sementara itu, Break digunakan untuk menghentikan proses iterasi.*/

fun main(){
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt) {
        //cek jika null, dan lanjut ke nilai selanjutnya dengan continue
        if (i == null) continue
        print(i)
    }

    for (i in listOfInt) {
        //cek jika null, dan berhenti ke nilai selanjutnya dengan break
        if (i == null) break
        print(i)
    }

    //Break dan Continue Labels @
    //Contoh dari sebuah label adalah foo@ atau bar@.
    perulangan@ for (i in listOfInt){
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@perulangan
        }
    }
}
