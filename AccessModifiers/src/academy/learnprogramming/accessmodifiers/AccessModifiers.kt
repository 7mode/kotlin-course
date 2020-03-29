package academy.learnprogramming.accessmodifiers

fun main(args: Array<String>) {
    val emp = Employee("Muhamad")
    println(emp.firstName)
    emp.fullTime = false
    println(emp.fullTime)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

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