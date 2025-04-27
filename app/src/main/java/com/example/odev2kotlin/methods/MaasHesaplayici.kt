package com.example.odev2kotlin.methods

class MaasHesaplayici {
    fun salaryCalculator(day:Int):Int{

        if(day>20){
            var payment=1600+30*8*(day-20)
            return payment
        }else{
            var payment=day*8*20
            return payment
        }
    }
}