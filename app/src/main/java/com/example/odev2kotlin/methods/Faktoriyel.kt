package com.example.odev2kotlin.methods

class Faktoriyel {
    fun calculateFactorial(number: Int): Int {
        if (number == 0 || number == 1) {
            return 1
        }
        var result = number
        for (i in number - 1 downTo 1) {
            result *= i
        }
        return result
    }
}