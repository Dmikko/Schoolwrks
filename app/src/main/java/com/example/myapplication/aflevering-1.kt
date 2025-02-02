package com.example.myapplication

fun main(){

// Assignment 1
// person is elligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is elligible to vote. Let the user input their age.


fun voteAge(enterAge:Int){
    if (enterAge < 18){
        println("With the age of $enterAge - You are not eligible to vote")
    } else {
        println("With the age of $enterAge - You are eligible to vote")
    }
}
    voteAge(15)
    voteAge(20)





//Assignment 2
//Define two functions to print the maximum and the minimum number respectively among three numbers

    val arrayMax : List<Int> = listOf(1,18,8);
    val arrayMin : List<Int> = listOf(1,18,-8);

    val max=arrayMax.maxOrNull()
    val min=arrayMin.minOrNull()

    println(max); //18
    println(min); //-8





//Assignment 3
//Write a Kotlin function named calculateAverage that takes in a list of numbers and returns their average.


val numbersToAvg : List<Int> = listOf(10,20,30,40,50)
    fun calculateAverage(numbers:List<Int>){
        val average: Double = numbersToAvg.average()
        println(average)
    }
calculateAverage(numbersToAvg)






//Assignment 4
//Write a method that returns if a user has input a valid CPR number

//CURRENT DOESNT MATCH DESCRIPTION CUS YOU DIDNT READ IT PROPERLY - RETURN HERE
//CURRENT DOESNT MATCH DESCRIPTION CUS YOU DIDNT READ IT PROPERLY - RETURN HERE
//CURRENT DOESNT MATCH DESCRIPTION CUS YOU DIDNT READ IT PROPERLY - RETURN HERE

    fun isCprValid(day: Byte, month: Byte, trail: String): Boolean {
        return when {
            // If day is less than 1 or exceeds 31, the function returns false
            (day < 1 || day > 31) -> false
            // If month is less than 1 or exceeds 12, the function returns false
            (month < 1 || month > 12) -> false
            // If trail is not a 6-digit number, the function returns false
            (!trail.matches(Regex("\\d{6}"))) -> false
            else -> true
        }
    }

// Call the function with trail as a String
    println(isCprValid(12, 12, "008229"))






//Assignment 5

    fun fizzer() {
        for (num in 1..100) {
            when {
                num % 3 == 0 && num % 5 == 0 -> println("FizzBuzz")
                num % 3 == 0 -> println("Fizz")
                num % 5 == 0 -> println("Buzz")
                else -> println(num)
            }
        }
    }

fizzer()





//Assignment 6
//Name abbreviator

    fun abbreviateName(fullName: String): String {
        // Fjern evt whitespace og opdel
        val parts = fullName.trim().split("\\s+".toRegex())

        // Hvis der kun er 1 ord, returner det som det er
        if (parts.size <= 1) return fullName.trim()

        // Tag initialer for alle navne undtagen det sidste ord
        val initials = parts.dropLast(1).map { it.first().uppercase() + "." }

        // Det sidste ord (efternavn)
        val lastName = parts.last().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

        // Sammensæt initialer og efternavn med mellemrum
        return initials.joinToString(" ") + " " + lastName
    }

    fun runIt() {
        val inputName = "John Bon Jovi"
        val abbreviated = abbreviateName(inputName)
        println(abbreviated)  // Udskriver: J. B. Jovi
    }

runIt()





//Assignment 7
//Calcutelate grade based on score(Int)

  fun calculateGrade(score:Int){
      when{
          score > 100 -> println("Not a Valid Score")
          score >= 90 -> println("A")
          score >= 80 -> println("B")
          score >= 70 -> println("C")
          score >= 60 -> println("D")
          score <= 59 -> println("F")
          score <= 0 -> println("Not a Valid Score")

      }
  }

    calculateGrade(100)







//Assignment 8
//filter words in list by set parameter length


    fun filterWordsByLength(words: List<String>, minLength: Int): List<String> {
        return words.filter { it.length >= minLength }
    }

    fun runItFilter() {
        val words = listOf("havetraktor", "asfalteksem", "kage", "masseødelæggelsesvåben", "ske", "sko", "ko", "marginaliseringsprocedure")
        val filteredWords = filterWordsByLength(words, 5)
        println(filteredWords) // Udskriver ord længere end 5 characters.
    }

    runItFilter()









}