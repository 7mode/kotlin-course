package academy.learnprogramming.accessmodifiers

fun main(args: Array<String>) {

    val car = Car("Silver", "Toyota", 2018)
    println("Datatype class - get toString for free\n$car") // Datatype class - get toString for free
    val car2 = Car("Silver", "Toyota", 2018)
    println("Datatype class - get equals for free\n${car == car2}") // Datatype class - get equals for free

    val car3 = car.copy()
    println("Copied car: $car3")

    val car4 = car.copy(color = "Pink", year = 2012)
    println("Copied car and changing properties: $car4")


    val emp = Employee("Muhamad")
    println("Regular class - no toString for free\n$emp") // Regular class - no toString for free :(
    println(emp.firstName)
    emp.fullTime = false
    println(emp.fullTime)

    val emp2 = Employee("Muhamad")
    println(emp2.firstName)
    println(emp2.fullTime)

    println("Regular class - Equals is not implemented, thus referential equality is done\n${emp == emp2}")

    val emp3 = Employee("Jane",false)
    println(emp3.firstName)
    println(emp3.fullTime)
}

//class Employee constructor(firstName: String) { // Primary constructor
//
//    val firstName: String
//
//    init {
//        this.firstName = firstName
//    }
//}


//class Employee(val firstName: String, var fullTime: Boolean = true) { // Primary constructor
//}

class Employee(val firstName: String, fullTime: Boolean = true) { // Primary constructor

    var fullTime = fullTime
    get() {
        println("Running custom get")
        return field
    }
    set(value) {
        println("Running custom set")
        field = value
    }

    init {
        println("Hello from init")
    }

}

data class Car(val color: String, val model: String, val year: Int) {

}