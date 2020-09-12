package oop.`interface`

interface IFly {
    fun fly()
}

class Bird : IFly{
    override fun fly() {
        TODO("Not yet implemented")
    }

}

//diharuskan melakukan override properti. Overriding properti bisa dilakukan pada sebuah konstruktor kelas
interface IFlyy{
    fun fly()
    val numberOfWings: Int
}

class Birdd(override val numberOfWings: Int) : IFlyy{
    override fun fly() {
        TODO("Not yet implemented")
    }
}
