package com.example.odev2kotlin.methods

class KotaHesaplayici {
    fun internetLimitCalculator(limit:Int):Int{

        if(limit>50){
            var price=100+(limit-50)*4
            return price
        }else{
            var price=100
            return price
        }
    }
}