package alma.obops.kotlinplayground

// Class definitions and inheritance

// Defines a class with no members and a zero-arg constructor
class Empty

// Defines a class with two members (immutable/mutable, non-nullable), a constructor,
// getters and setters
class User(val username: String, var email: String)

// Class Vehicle can be subclassed (open), by default classes are final
open class Vehicle(val wheelNo: Int, val name: String);

// Class Cycle describes all Vehicles with two wheels
class Cycle(name: String, val passengers: Int) : Vehicle(2, name)

fun main() {
    val empty = Empty();        // create an instance of Empty (no 'new' keyword)
    val me = User("amchavan", "amchavan@eso.org")
    println("username: " + me.username + ", email: " + me.email)

    val bicycle = Cycle("street bike", 1)   // bicycle has one passenger
    println("Vehicle '" + bicycle.name + "' has " + bicycle.wheelNo + " wheels")
    println("Vehicle '$bicycle")
}
