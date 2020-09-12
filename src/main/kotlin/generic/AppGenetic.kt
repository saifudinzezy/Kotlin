package generic

fun main(){

}

//class generic
//jika kita mempunyai sebuah kelas yang mewarisi kelas atau interface generic,
//maka kita perlu menentukan tipe argumen sebagai tipe dasar dari parameter generic kelas tersebut
class LongList : List<Long>{
    override fun get(index: Int): Long {
        TODO("Not yet implemented")
    }

}

//all generic class
class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }

}

//tipe parameter ke dalam angle brackets (<>)
interface List<T>{
    //delegation
    operator fun get(index: Int) : T
}