package app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class StringLogReadWriteProperty(var data: String) : ReadWriteProperty<Any, String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get Property ${property.name} with value $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set Property ${property.name} from $data to $value")
        data = value
    }
}

class Person(param: String){
    var name: String by StringLogReadWriteProperty(param)
}

fun main() {
    val person1 = Person("Luthfi")

    println(person1.name)

    person1.name = "Sugara"

    println(person1.name)
}