package com.example.odev2kotlin.methods

fun main() {
    println("Enter the length of the shortest side of the rectangle")
    val shortInput= readLine()
    val shortEdge=shortInput?.toDoubleOrNull()
    println("Enter the length of the longest side of the rectangle")
    val longInput= readLine()
    val longEdge=longInput?.toDoubleOrNull()
    println( perimeterCalculator(shortEdge!!,longEdge!!))
}