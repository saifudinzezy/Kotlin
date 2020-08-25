package nullable.safe_calls

fun main(){
    val text: String? = null
    //Dengan safe call, kompiler akan melewatkan proses jika objek tersebut bernilai null.
    println(text?.length)
}