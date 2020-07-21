package academy.learningprogramming.challenge1

fun main(args: Array<String>) {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 is referentially equal to hello2 ${hello1 === hello2}")
    println("hello1 is structurally equal to hello2 ${hello1 == hello2}")

    var num = 2988

    val text: Any = "The sny type is the root of the Kotlin class hierarchy"

    if (text is String) {
        println(text.toUpperCase())
    }

    println("""   1
        |  11
        | 111
        |1111  
    """.trimMargin())

    println("""1   1
        1  11
        1 111
        11111  
    """.trimMargin("1"))
}