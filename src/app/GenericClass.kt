package app

import data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Luthfi", 10)
    myDataString.printlnData()

    val myDataInt = MyData(10, "Sugara")
    myDataInt.printlnData()
}