package academy.learnprogramming.functions

import academy.learnprogramming.utils.Utils

fun main(args: Array<String>) {
    println(labelMultiply(3, 4, "The result is:"))

    val emp = Employee("Muhamad")
    println(emp.upperCaseFirstName())

    println(labelMultiply(2, 6))

    val car1 = Car("blue", "Toyato", 2009)
    val car2 = Car("silver", "Toyato", 2018)
    val car3 = Car("black", "Seat", 2020)

    printColors(car1, car2, car3)

    val manyCars = arrayOf(car1, car2, car3)
    printColors(*manyCars)

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCar = arrayOf(*manyCars, *moreCars, car4)
    for (c in lotsOfCar) {
        println(c)
    }

    println(Utils().upperFirstAndLast("this is all lowercase string"))


    val s = "this is all lowercase string" // receiver object
    println(s.upperFirstAndLast())
}

fun String.upperFirstAndLast(): String { // the class String is the reciever
    val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

fun labelMultiply(operand1: Int, operand2: Int, label: String = "The answer is: ") =  // function with expression body
    "$label ${operand1 * operand2}"

class Employee(val firstName: String) {
    fun upperCaseFirstName() = this.firstName.toUpperCase()
}

data class Car(val color: String, val model: String, val year: Int)