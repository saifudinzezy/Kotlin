package function.member_references.function_references

fun main(){
    val numbers = 1.rangeTo(10)
    //operator :: kita bisa menggunakannya sebagai instances dari function type
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)
    //mereferensikan sebuah extensions function
    //dengan ikut menyertakan objek yang menjadi receivernya sebelum operator ::
    val evenNumber = numbers.filter(Int::isEvenNumberr)
}

fun isEvenNumber(number: Int) = number % 2 == 0

fun Int.isEvenNumberr() = this % 2 == 0