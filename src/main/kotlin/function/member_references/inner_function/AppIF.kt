package function.member_references.inner_function

fun main(){
    setWord("Hello")
    println(summ(10, 30,10))
}

//inner function hanya bisa diakses setelah fungsi tersebut didefinisikan
fun setWord(message: String){
    //printMessage() // ERROR: Unresolved references
    fun printMessage(){
        println(message)
    }

    printMessage()
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB
}

//extention inner function
fun summ (valueA: Int, valueB: Int, valueC: Int): Int{
    fun Int.validateNumber(){
        if (this == 0){
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB
}