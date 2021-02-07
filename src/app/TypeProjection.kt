package app

class Container<T>(var data: T)

fun copyContainer(from: Container<out Any>, to: Container<in Any>){
    to.data = from.data
}

fun main() {
    val container1 = Container("Eko")
    val container2 : Container<Any> = Container("Luthfi")

    copyContainer(container1, container2)

    println(container1.data)
    println(container2.data)
}