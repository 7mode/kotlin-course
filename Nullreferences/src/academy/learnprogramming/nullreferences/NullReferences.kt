package academy.learnprogramming.nullreferences

fun main(args: Array<String>) {
    val str: String? = "Thus isn't null"
    str?.let { printText(it) } //lambda

    val str4 = str!!.toUpperCase()
    // if (str == null) {
    //     throw exception
    // } else {
    //     str.toUpperCase()
    // }

    str?.toUpperCase()
    // same like checking if not null then perform the operation
    // if (str == null) {
    //     null
    // } else {
    //     str.toUpperCase()
    // }

    val str2 = str ?: "This is the default value"
    // if (str == null) {
    //     str2 = "This is the default value"
    // } else {
    //     str2 = str
    // }

    println(str2)

    // safe cast operator
    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)
    println(str3?.toUpperCase())

    val strNull: String? = null
    val anotherString = "This is not nullable"
    println(strNull == anotherString) // equals operator is a safe operator

    val nullableInts = arrayOfNulls<Int?>(5)
    for (el in nullableInts) {
        println(el)
    }
}

fun printText(text: String) {
    println(text)
}