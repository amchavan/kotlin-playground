package alma.obops.kotlinplayground

// Mutable and immutable variables

fun main() {
    var a: Int      // declare mutable variable of type Int
    a = 5
    a = 6

    var b = 6       // declare and initialize mutable variable, inferred type
    b = 7

    val c = 8       // declare and initialize immutable variable (oxymoron?)
//    c = 0           // cannot assign value to a constant

    println("a = $a")
    println("b = $b")
    println("c = $c")
}
