package alma.obops.kotlinplayground

// Vararg parameter
//------------------------------

fun logAll( vararg messages: String ) {
    for( message in messages ) {        // type of message is inferred
        log( message )                  // function log is visible
    }
}

fun main() {
    logAll( "Alpha", "Beta", "Gamma", "Delta" );
}
