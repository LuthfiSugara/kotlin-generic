package app

class Contravariant<in T>{
    fun sayHello(param: T){
        println("Hello $param")
    }

//    Tidak boleh
//    fun getData(): T{
//        return data
//    }
}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny

//    contravariantString.getData() //Error
    contravariantString.sayHello("Luthfi")
}