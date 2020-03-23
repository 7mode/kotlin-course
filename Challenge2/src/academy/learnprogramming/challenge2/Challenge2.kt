package academy.learnprogramming.challenge2

fun main(args: Array<String>) {
    val float1: Float? = -3847.384F
    val float2: Float? = -3847.384F
    val float3: Float? = -3847.384.toFloat()

    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    val intArray = Array<Int?>(40) { i -> (i + 1) * 5 }

    val charArray = charArrayOf('a', 'b', 'c')

    val x: String? = "I AM IN UPPERCASE"
    val z = x?.toLowerCase() ?: "I give up"

    x?.let { it.toLowerCase().replace("am", "am not") }
}