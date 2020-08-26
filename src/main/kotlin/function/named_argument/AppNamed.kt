package function.named_argument

fun main(){
    //menentukan argumen dari parameter mana yang ingin dilampirkan dengan memanggil nama dari parameter tersebut.
    val fullName = getFullName(middle = "Anas", first = "Supri", last = "Jamal")
    println(fullName)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}