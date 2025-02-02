package com.example.myapplication

fun main(){
    println("hello world!")

    val age: Int = 30
    val height: Double = 1.74
    val shoeSize: Int = 44
    val name: String = "Mike"

    println("Age=$age, Height=$height, Shoesize=$shoeSize, Name=$name")



    //function that takes a string and converts to uppercase
    fun toUpp(thing:String){
        println("$thing".uppercase())
    }
toUpp("john")
    toUpp("john john john")


    //print index of string "name"
    println(name[3])



//check if strings are equal to each other

fun stringEqual(name1: String,name2 : String){

    var result: String = "$name1, $name2";
    if(name1.lowercase() == name2.lowercase()){
        println("its the same")
    }else{
        println("they are not the same")
    }
    println(result)
}
    stringEqual("JoHnnY", "johnny")



//for loop that calculates the sum of all even numbers between 1-50
    var sum: Int = 0

    for (i in 1..50){
        if(i %2 == 0){
            sum=sum+i;
        }
    }
println(sum)






//find the second largest integer in list/array
    var prices:Array<Int> = arrayOf(10,20,30,40,50)




}


