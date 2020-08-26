package function.lambda.function_type

fun main() {
    println(sum(20, 10))

    //instance function type dengan invoke() dll
    val sumResultInvoke = sum.invoke(10, 10)
    val sumResult = sum(10, 10)

    //nullable
    val sumInvokeNull = sum?.invoke(10, 20)
    println(sumResultInvoke)
    println(sumInvokeNull)
}

//typealias fungsi yang memiliki function type yang sama
typealias AritMatic = (Int, Int) -> Int

//implement function lambda
val sum: AritMatic = { value1, value2 -> value1 + value2 }
val multiply: AritMatic = { valueA, valueB -> valueA * valueB }

//menandai function type sebagai nullable dengan menempatkannya
//di dalam tanda kurung dan diakhiri dengan safe call
typealias Arithmetic = ((Int, Int) -> Int)?
val sumNull: Arithmetic = { valueA, valueB -> valueA + valueB }