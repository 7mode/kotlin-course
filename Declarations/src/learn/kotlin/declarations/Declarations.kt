package learn.kotlin.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    val employeeOne = Employee("Jacob", 1)
    val employeeTwo = Employee("Sam", 2)
    val employeeThree = Employee("Sam", 2)
    // == checks for structural equality
    // === checks for referential equality
    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)
    val employeeFour = employeeTwo
    println(employeeFour === employeeTwo)

    println(employeeFour != employeeTwo)
    println(employeeFour !== employeeTwo)
    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)


    var number: Int
    number = 10
    val number2 = 20

    val employees: EmployeeSet

    val employee1 = Employee("Muhamad", 1)
    employee1.name = "Muhamad Najjar"

    val employee2: Employee
    if (number < number2) {
        employee2 = Employee("Nx", 2)
    } else {
        employee2 = Employee("Nx", 3)
    }

    println(employee1)

    val change = 3.4
    println("Your change is $$change")

    val num1 = 234
    val num2 = 654

    println("The value of $num1 divided by $num2 is ${num1 / num2}")

    println("The employee's id is ${employee1.id}")

    val myName= "Muhamad"
    val justLongString = """My name is $myName
        |I'm learning strings in Kotlin!
        |Wohow!!
    """.trimMargin()

    println(justLongString)
}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}