package app

class Invariant<T>(val data: T)

fun main() {
    val invariatString = Invariant("String")
//    val invariantAny: Invariant<Any> = invariatString //Error
//    invariantAny.data = 100 //bahaya

    println(invariatString.data)
}