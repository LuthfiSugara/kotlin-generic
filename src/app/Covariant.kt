package app

class Covariant<out T>(val data: T){
    fun data(): T{
        return data
    }

//    TIdak boleh membuat input dengan generic covariant
//    fun setData(param: T){
//        data = param
//    }
}

fun main() {
    val covariantString = Covariant<String>("Luthfi")
    val covariantAny : Covariant<Any> = covariantString

    println(covariantAny.data())

//    covariantAny.setData(100)
}