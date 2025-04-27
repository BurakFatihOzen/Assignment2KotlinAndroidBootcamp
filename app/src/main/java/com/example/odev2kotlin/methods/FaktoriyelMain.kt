package com.example.odev2kotlin.methods

fun main() {
    println("Enter the number you want to calculate its factorial")
    val factInput= readLine()
    val factNumber=factInput?.toIntOrNull()
    println(calculateFactorial(factNumber!!))
}