package academy.learnprograming.datatypes

fun main(args: Array<String>) {
   val myInt = 10
   println("Default datatype is ${myInt is Int}")
   var myLong = 22L

   myLong = myInt.toLong()

   val myByte: Byte = 111
   var short: Short
   short = myByte.toShort()

   val anotherInt = 5

   var myDouble = 2421.234
   println(myDouble is Double)

   val myFloat = 234.345f
   println("This is Flot ${myFloat is Float}")

   myDouble = myFloat.toDouble()

   val char = 'b'
   val myChar = 65.toChar()
   println(myChar)

   val names = arrayOf("Bob","Sam","Jeo")

   val longs1 = arrayOf(1L, 2L, 3L)
   val longs2 = arrayOf<Long>(1, 2, 3, 4)

   val longs3 = arrayOf(1, 2, 3, 4)

   println(longs1 is Array<Long>)
   println(longs2 is Array<Long>)
   println(longs3 is Array<Int>)

   println(longs1[2])

   val evenNumbers = Array(16) { i -> i * 2 }

   for (number in evenNumbers) {
      println(number)
   }

   val lotsOfNumbers = Array(10000) { i -> i + 1 }

   val allZeroes = Array(100) { 0 }

   var someArray: Array<Int>
   someArray = arrayOf(1, 2, 3, 4)

   for (number in someArray) {
      println(number)
   }

   someArray = Array(6) { i -> (i + 1) * 10}


   for (number in someArray) {
      println(number)
   }

   val mixedArray = arrayOf("hello", 22, 745L , 'a')


   for (number in mixedArray) {
      println(number)
   }

   println(mixedArray is Array<Any>)

   val intsArray = intArrayOf(1, 2, 3, 4) // more efficient! + it initialize automatically with the default value of the type

   var myIntArray = IntArray(5)


   for (number in myIntArray) {
      println(number)
   }

   myIntArray = evenNumbers.toIntArray() // int array of primitives

   val convertedInArray = intsArray.toTypedArray() // converts it to Int array (not primitives)
}