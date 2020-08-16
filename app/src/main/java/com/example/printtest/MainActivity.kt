package com.example.printtest

fun main(){
    class Programmer(private val name: String, private val yearOfExperience: Int){
        fun getName(): String {
            return name
        }

        fun getExperience(): Int {
            return yearOfExperience
        }

    }

    val programmer = Programmer("Phoenix", 15)
    println(programmer.getName())
    println(programmer.getExperience())
}