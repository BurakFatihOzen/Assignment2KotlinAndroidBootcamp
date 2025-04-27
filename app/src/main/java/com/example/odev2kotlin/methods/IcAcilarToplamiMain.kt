package com.example.odev2kotlin.methods

fun main() {
    println("Enter edge count of your shape.")
    val edgeCount= readLine()?.toIntOrNull()
    if (edgeCount != null) {
        println("Sum of interior angles: ${sumX(edgeCount)}")
    } else {
        println("Invalid input!")
    }
}