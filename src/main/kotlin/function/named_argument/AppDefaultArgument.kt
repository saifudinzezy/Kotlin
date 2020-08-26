package function.named_argument

fun main(){
    //menambahkan nilai default untuk argument
    val fullName = getFullNameDefault()
    print(fullName)
}

fun getFullNameDefault(
        first: String = "Kotlin",
        middle: String = " is ",
        last: String = "Awesome"): String {
    return "$first $middle $last"
}