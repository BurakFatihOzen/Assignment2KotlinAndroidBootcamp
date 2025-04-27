package com.example.odev2kotlin.methods

fun main() {
    println("Enter your working day.")
    val day= readLine()?.toIntOrNull()
    if(day!=null){
        println("Your salary:${salaryCalculator(day)}")
    }else
        println("Invalid input")
    println("\n*******************")
}