package function.member_references

fun main(){
    //sebuah lambda dengan function type
    val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }


    //kita bisa memisahkan lambda expression menjadi fungsi tersendiri dan
    //mereferensikannya langsung sebagai instance dari function type
    //dengan mekanisme Reflection yang berarti seperangkat fitur bahasa dan
    //library yang memungkinkan kita untuk mengamati struktur kode
    //dari proyek yang sedang kita kerjakan secara langsung.
    val sums: (Int, Int) -> Int = ::count
}

fun count(Value1 : Int, value2: Int) : Int{
    return Value1 + value2
}