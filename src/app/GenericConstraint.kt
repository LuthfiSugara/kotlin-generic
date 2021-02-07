package app

interface CanSayHello{
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePresident: Employee(), CanSayHello{
    override fun sayHello(name: String) {
        println("Hello $name, I'm vice president")
    }

}

class Company<T>(val employee: T) where T : Employee, T: CanSayHello

fun main() {
//    val data1 = Company(Employee()) //Error
//    val data2 = Company(Manager()) //Errror
    val data3 = Company(VicePresident())
//    val data = Company("String") //Error
}