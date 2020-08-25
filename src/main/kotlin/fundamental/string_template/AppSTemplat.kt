package fundamentalu.string_template

fun main(){
    val name = "Kotlin"
    val old = 3
    println("My name is $name, im $old years old")

    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")
}