package function.lambda

fun main(){
    message()
    printMessage("udin")
}

//Untuk membedakannya dengan body, daftar parameter yang ada dipisahkan dengan tanda ->
//kompiler akan mengembalikan nilai berdasarkan expression atau statement di baris terakhir di dalam body.
val message = { println("Hello From Lambda") }
val printMessage = { message: String -> println(message)}