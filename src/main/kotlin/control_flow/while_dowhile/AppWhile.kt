package control_flow.while_dowhile

/*While bersifat Entry Controlled Loop. Artinya, kondisi yang diberikan akan dievaluasi
terlebih dahulu. Jika kondisi tersebut terpenuhi maka proses perulangan akan dijalankan.*/
fun main() {
    var counter = 1
    while (counter <= 7) {
        println("Hello word!")

        counter++
    }
}