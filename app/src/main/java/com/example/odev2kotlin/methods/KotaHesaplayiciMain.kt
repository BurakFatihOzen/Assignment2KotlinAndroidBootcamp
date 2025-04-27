package com.example.odev2kotlin.methods

fun main() {
    println("Enter your usage of internet.")
    val limit= readLine()?.toIntOrNull()
    if (limit!=null){
        println("Your bill is : ${internetLimitCalculator(limit)}")
    }else
        println("Invalid input")
}