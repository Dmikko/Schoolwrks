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

//CURRENT DOESNT MATCH ASSIGNMENT
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
            }
        }
    }






























}