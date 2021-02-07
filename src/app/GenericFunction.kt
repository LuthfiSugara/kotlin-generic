package app

import data.Function

fun main() {
    val function = Function("Luthfi")

    function.sayHello("Luthfi")
    function.sayHello<String>("Sugara")

    function.sayHello(10)
    function.sayHello<Int>(100)
}