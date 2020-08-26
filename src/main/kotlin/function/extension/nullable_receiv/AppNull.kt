package function.extension.nullable_receiv

fun main(){
    //Lalu kapan kita membutuhkannya? Tentunya jika kita mempunyai sebuah objek yang bernilai null.
    //ijinkan null
    val value: Int? = null
    println(value.slice)
    println(value?.slices)
}

val Int?.slice: Int
    //?: jika null isikan kosong
    get() = this?.div(2) ?: 0

val Int.slices: Int
    get() = this.div(2)