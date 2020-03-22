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


//    var number: Int
//    number = 10
//    val number2 = 20
//
//    val employees: EmployeeSet
//
//    val employee1 = Employee("Muhamad", 1)
//    employee1.name = "Muhamad Najjar"
//
//    val employee2: Employee
//    if (number < number2) {
//        employee2 = Employee("Nx", 2)
//    } else {
//        employee2 = Employee("Nx", 3)
//    }
}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }
}