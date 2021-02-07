package app

import data.Fruit

fun main() {
    val fruit1 = Fruit("Luthfi", 10)
    val fruit2 = Fruit("Luthfi", 10)

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
}