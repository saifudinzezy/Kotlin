package function.extension

fun main(){
    //
    10.printInt()
    println(10.plusThree())
}

//kelas Int pada kode di atas digunakan sebagai receiver type,
//sedangkan kata kunci this adalah receiver type yang bertindak sebagai objeknya.
fun Int.printInt(){
    print("Value $this")
}

//dengan retun type
fun Int.plusThree(): Int {
    return this + 3
}