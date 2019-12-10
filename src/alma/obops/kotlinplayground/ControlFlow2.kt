package alma.obops.kotlinplayground

import java.lang.IllegalArgumentException

// When, if, etc.
// -----------------------------------------

fun max(a: Int, b: Int) = if (a > b) a else b   // No ternary operator in Kotlin!

fun discriminate( arg : Any? ) {
    when( arg ) {                                                // when instead of switch
        null      -> throw IllegalArgumentException( "Null!" )   // This is a Java exception
        0         -> 0
        is Int    -> doInt( arg )
        is String -> doString( arg )
        else      -> doUnsupported( arg )
    }
}

fun doUnsupported(arg: Any) {
    log( "Unsupported arg: '$arg'", "WARN" )
}

fun doString(s: String) {
    log( "Received String: '$s'" )
}

fun doInt(i: Int) {
    log( "Received Int: $i" )
}

fun main() {
    log( "max(1,2) = ${max(1,2)}" )

    val a = "abcd"
    var b = "ab"
    b += "cd"
    println( "a == b  : ${a == b}")         // equivalent to a.equals( b ) in Java
    println( "a === b : ${a === b}")        // equivalent to a == b in Java

    discriminate( 17 )
    discriminate( 0 )   // ??
    discriminate( "It was a dark and stormy night" )
    discriminate( 3.14 )
    discriminate( null )
}

