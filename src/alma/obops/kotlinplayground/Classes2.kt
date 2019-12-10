package alma.obops.kotlinplayground

// Data classes definitions
// ----------------------------------

data class Target( val ra: Double, val dec: Double )    // Immutable data class

fun main() {
    val t1 = Target( 22.2, -78.5 )
    val t2 = Target( dec=-56.7, ra=33.3 )

    println( "t1: $t1" )        // toString() method
    println( "t2: $t2" )

    println( "t1.ra = ${t1.ra}" )
    println( "t2 second constructor parameter = ${t2.component2()}" )

    println( "t1 == t2: ${t1 == t2}" )
    println( "t1.hashCode(): ${t1.hashCode()}" )

    val t1copy1 = t1.copy();
    println( "t1 == t1copy1: ${t1 == t1copy1}" )

    val t1copy2 = t1.copy( dec = 10.4 );
    println( "t1 == t1copy2: ${t1 == t1copy2}" )
}
