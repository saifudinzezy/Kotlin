package function.member_references.property_references

var message = "Kotlin"
fun main(){
    //KMutableProperty
    //Operator :: juga dapat digunakan untuk mereferensikan sebuah properti
    //bisa mengakses nama, fungsi setter getter, dll.
    println(::message.name)
    println(::message.get())

    ::message.set("Java")

    println(::message.get())
}