package com.example.odev2kotlin.methods

class AharfiBulucu {
    fun aCalculator(a:String):Int{
        var count=0
        for (char in a){
            if(char=='a' || char=='A'){
                count++
            }
        }
        return count
    }
}