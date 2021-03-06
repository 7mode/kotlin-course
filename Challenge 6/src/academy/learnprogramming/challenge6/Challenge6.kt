package academy.learnprogramming.challenge6

fun main(args: Array<String>) {
    for (i in 5..5000 step 5) println(i)
    for (i in -500..0) println(i)
    var total: Int
    var secondToLast = 0
    var last = 1

    println(secondToLast)
    println(last)
    for (i in 1..13) {
        total = secondToLast + last
        println(total)
        secondToLast = last
        last = total
    }

    iloop@ for (i in 1..5) {
        println(i)
        if (i == 2) break
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 97) continue@iloop
            }
        }
    }

    val num = 100
    println(if (num < 100) {
        -234.567
    } else if (num > 100) {
        4444.555
    } else {
        0.0
    })

    val dnum = when {
        num < 100 -> -234.567
        num > 100 -> 4444.555
        else -> 0.0
    }

    println(dnum)

}