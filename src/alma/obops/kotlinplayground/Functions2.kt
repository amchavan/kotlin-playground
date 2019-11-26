package alma.obops.kotlinplayground

// Infix methods and operator overloading
//---------------------------------------

fun Int.double() = this + this;                 // add a method to Int
infix fun Int.multipliedBy(y: Int) = this * y   // add an infix method to Int
operator fun String.times(n: Int) = this.repeat(n)  // define a new binary operator for String

fun main() {
    println( "3 doubled is " + 3.double().toString() );
    println( "3 multiplied by 4 is " + (3.multipliedBy(4)).toString() );
    println( "3 multiplied by 5 is " + (3 multipliedBy 5).toString() );
    println( "# * 4 is " + "#" * 4 );
}
