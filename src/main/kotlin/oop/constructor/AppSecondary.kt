package oop.constructor

fun main(){
    val dicodingCat = AnimalSecondary("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = AnimalSecondary("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")
}

private class AnimalSecondary(
        //primary constructor
        name: String, weight: Double, age: Int
){
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    //init untuk construktor
    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false
    }

    //secondary constructor
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age){
        this.isMammal = isMammal
    }
}