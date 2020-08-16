package com.example.printtest

fun main(){

    class MyInterfaceImpl: MyInterface{
        override fun display() {
            println("This is Phoenix MyInterface")
        }
    }

    val myInterface = MyInterfaceImpl()
    println(myInterface.display())

}

interface MyInterface {
    fun display()
}