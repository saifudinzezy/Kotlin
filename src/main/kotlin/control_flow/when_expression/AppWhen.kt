package control_flow.when_expression

import kotlin.random.Random

/*
Untuk menentukan statement atau expression kita menggunakan If Expression.
Selain itu kita juga bisa gunakan  When Expression,
yakni mekanisme yang memungkinkan nilai dari sebuah variabel/expression, mampu mengubah alur program.*/

/*if expression sebaiknya digunakan ketika kondisi yang diberikan tidak lebih dari 2 (dua)
dan kondisi yang diberikan tidak terlalu rumit.
when expression, ia bisa digunakan ketika kondisi yang diberikan lebih dari 2 (dua)*/
fun main() {
    val value = 9
    when(value){
        6 -> println("Value is $value")
        7 -> println("Value is $value")
        8 -> println("Value is $value")
        //akan dievaluasi jika tiada satupun kondisi yang terpenuhi
        else -> println("Value not found")
    }

    //when expression dapat mengembalikan nilai dan dapat disimpan di dalam sebuah variabel
    val values = 8
    val stringOfValue = when (values) {
        6 -> "value is 6"
        7 -> "value is 7"
        //dua atau lebih baris kode yang akan kita jalankan di setiap branch
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> "value cannot be reached"
    }

    println(stringOfValue)

    //memeriksa instance dengan tipe tertentu dari sebuah objek menggunakan is atau !is
    val anyTpe: Any = 100L
    when(anyTpe){
        is Long -> println("is Long")
        is String -> println("is String")
        else -> println("undefined")
    }

    //when expression juga bisa kita gunakan untuk memeriksa nilai yang terdapat pada sebuah Range atau Collection
    val intValue = 27
    val ranges = 10..50

    when(intValue){
        in ranges -> println("Value is in the range")
        !in ranges -> println("Value is outside the range")
        else -> println("Value undefined")
    }

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)
}

fun getRegisterNumber() = Random.nextInt(100)