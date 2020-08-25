package control_flow.while_dowhile

/*Do While bersifat Exit Controlled Loop di mana proses perulangan akan langsung dijalankan di awal.
Jika telah selesai, barulah kondisi yang diberikan akan dievaluasi.*/
fun main() {
    var counter = 1
    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)
}