package com.example.odev2kotlin.methods

fun main() {
    println("Enter a word.")
    val wordInput= readLine()
    println("Number of a letter is: ${wordInput?.let { aCalculator(it) }}")
}