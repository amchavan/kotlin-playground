package alma.obops.kotlinplayground

// For, while, etc.
// -----------------------------------------

fun main() {

    val bComposers = listOf( "Bach", "Brahms", "Beethoven", "Berlioz" );
    print( "B-list composers: ")
    for( composer in bComposers.sorted() ) {    // loop over a list
        print( "$composer " )
    }
    println()

    for( i in 0..5 ) {          // Introducing ranges
        print( "$i ")
    }
    println()

    for( i in 5 downTo 0 ) {    // inverted range
        print( "$i ")
    }
    println()

    for( i in 'a'..'z' ) {      // ranges of chars are allowed too
        print( "$i ")
    }
    println()

    var i = 6;
    while( i <= 10 ) {          // Kotlin also has do-while loops
        print( "${i++} ")
    }
    println()
}

