package alma.obops.kotlinplayground

// Lists, Maps, etc.
// ----------------------------------

val languages = listOf( "Java", "Pascal", "FORTRAN", "COBOL", "Python" )
val programmers = mapOf( "Maurizio" to "Java",
                         "Rodrigo"  to "Python" )

fun main() {
    print( "All languages: " )
    languages.forEach { x -> print( "$x " ) }
    println()

    print( "P-languages: " )
    println( languages.filter { x -> x.startsWith( "P" ) } )

    print( "First P-language: " )
    println( languages.first { x -> x.startsWith( "P" ) } )
//    println( languages.first { x -> x.startsWith( "PQQQ" ) } )

    print( "All-uppercase language: " )
    println( languages.find { x -> x == x.toUpperCase() } )
    println( languages.find { x -> false } )

    print( "Lowercase: " )
    println( languages.map { it.toLowerCase() } )   // equivalent to x -> x.toLowerCase()

    print( "Python programmer: " )
    println( programmers.filter { x -> x.value == "Python" }.keys )
}
