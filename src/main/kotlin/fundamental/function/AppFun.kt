package fundamental.function

fun main(){
    val user = setUser("ani", 20)
    println(user)

    printUser("Jamal")
}

//expression body
//return type String
fun setUser(name: String, age: Int) : String = "Your name is $name, and age $age"

//prosedural
fun printUser(name: String){
    println("Your name is $name")
}
