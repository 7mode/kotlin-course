package academy.learnprogramming.oochallenge

import java.awt.Color

fun main(args: Array<String>) {
    val bicycle = KotlinBicycle(10, 3, 10)
    bicycle.printDescription()

    val mountainBike = KotlinMountainBike(10,44,24,64)
    mountainBike.printDescription()

    val roadBike = KotlinRoadBike(52,34,73,12)
    roadBike.printDescription()

    val bicycle1 = KotlinBicycle(10, 3)
    bicycle1.printDescription()

    val mountainBike1 = KotlinMountainBike(10,44,24)
    mountainBike1.printDescription()

    val roadBike1 = KotlinRoadBike(52,34,73)
    roadBike1.printDescription()

    val mountainBike3 = KotlinMountainBike("Blue",10,44,24)
    mountainBike3.printDescription()

    KotlinMountainBike.availableColors.forEach { println(it) }
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {
    fun applyBreak(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10):
        KotlinBicycle(cadence, speed, gear) {

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 53) :
        this(seatHeight, cadence, speed, gear) {
        println("This is the color $color")
    }

    companion object {
        val availableColors: List<String> = listOf("blue", "red", "white", "black", "green")
    }

    override fun printDescription(){
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10):
        KotlinBicycle(cadence, speed, gear) {

    override fun printDescription(){
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}


