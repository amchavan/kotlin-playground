package alma.obops.kotlinplayground

// Higher order functions
//------------------------------

fun apply( op: (Double,Double) -> Double, a : Double, b: Double ): Double {
    return op( a, b )
}

fun max( a : Double, b: Double ) = if (a >= b ) a else b;
fun sum( a : Double, b: Double ) = a + b;

fun main() {
    println( "max(1.0, 2.0) = ${apply( ::max, 1.0, 2.0 )}")
    println( "sum(1.5, 2.5) = ${apply( ::sum, 1.5, 2.5 )}")
}
