package alma.obops.kotlinplayground

// Default parameter values, named arguments and return values
//------------------------------------------------------------

fun log(message: String, level: String = "INFO") {  // returns nothing => kotlin.Unit
    println("[$level] $message")                    // string interpolation with '$'
}

fun plus(x : Int, y : Int) : Int {      // return type is declared
    return x + y
}

fun minus( x : Int, y : Int) = x - y    // a single expression, return type is inferred

fun main() {                            // main() can be called without parameters
    log("This is an info message")     // use default value for level
    log("This is an error message", "ERROR")
    log(level = "SURPRISE", message="This is a surprise message")   // named arguments

    log( "plus(4,3) = " + plus(4,3) )
    log( "minus(4,3) = " + minus(4,3).toString() )
}
