package com.example.odev2kotlin.methods

fun main() {
    println("Enter degree that you want to convert to Fahrenheit.")
    val degreeInput = readLine()
    val degree=degreeInput?.toDoubleOrNull()
    print(degree)
    println(" C")
    print(degreeToFahrenheit(degree!!))
    println(" F")
}