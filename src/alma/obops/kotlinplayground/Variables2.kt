package alma.obops.kotlinplayground

// Nullable and non-nullable variables


fun main() {
    var a: String       // declare non-nullable variable of type Int
//    a = null         // cannot assign a null value

    var b: String?       // declare nullable variable of type Int
    b = null           // it's ok to assign a null value

//    var l1 = b.length    // cannot take length
    var l = b?.length    // safe operator, will return null -- var l is implicitly nullable

    println("l = " + l.toString())
    println("length = " + nullableLength(b))
}

fun nullableLength(s: String?): Int {
    return if (s == null) 0 else s.length   // alternatively: return s?.length ?: 0
}
