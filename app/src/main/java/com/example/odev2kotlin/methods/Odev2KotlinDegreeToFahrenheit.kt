package com.example.odev2kotlin.methods

fun main() {
    println("Enter degree that you want to convert to Fahrenheit.")
    val degreeInput = readLine()
    val degree=degreeInput?.toDoubleOrNull()
    print(degree)
    println(" C")
    print(degreeToFahrenheit(degree!!))
    println(" F")
    println("\n*******************")

    println("Enter the length of the shortest side of the rectangle")
    val shortInput= readLine()
    val shortEdge=shortInput?.toDoubleOrNull()
    println("Enter the length of the longest side of the rectangle")
    val longInput= readLine()
    val longEdge=longInput?.toDoubleOrNull()
    println( perimeterCalculator(shortEdge!!,longEdge!!))
    println("\n*******************")


    println("Enter the number you want to calculate its factorial")
    val factInput= readLine()
    val factNumber=factInput?.toIntOrNull()
    println(calculateFactorial(factNumber!!))
    println("\n*******************")


    println("Enter a word.")
    val wordInput= readLine()
    println("Number of a letter is: ${wordInput?.let { aCalculator(it) }}")
    println("\n*******************")


    println("Enter edge count of your shape.")
    val edgeCount= readLine()?.toIntOrNull()
    if (edgeCount != null) {
        println("Sum of interior angles: ${sumX(edgeCount)}")
    } else {
        println("Invalid input!")
    }
    println("\n*******************")


    println("Enter your working day.")
    val day= readLine()?.toIntOrNull()
    if(day!=null){
        println("Your salary:${salaryCalculator(day)}")
    }else
        println("Invalid input")
    println("\n*******************")


    println("Enter your usage of internet.")
    val limit= readLine()?.toIntOrNull()
    if (limit!=null){
        println("Your bill is : ${internetLimitCalculator(limit)}")
    }else
        println("Invalid input")


}

fun degreeToFahrenheit(degree:Double):Double{
    return (degree*1.8+32)
}

fun perimeterCalculator(shortEdge:Double,longEdge:Double):Double{
    val perimeter=2*shortEdge+2*longEdge
    return perimeter
}

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

fun aCalculator(a:String):Int{
    var count=0
    for (char in a){
        if(char=='a' || char=='A'){
            count++
        }
    }
    return count
}

fun sumX(edgeCount:Int):Int{
    return (edgeCount-2)*180
}

fun salaryCalculator(day:Int):Int{

    if(day>20){
        var payment=1600+30*8*(day-20)
        return payment
    }else{
        var payment=day*8*20
        return payment
    }
}

fun internetLimitCalculator(limit:Int):Int{

    if(limit>50){
        var price=100+(limit-50)*4
        return price
    }else{
        var price=100
        return price
    }
}

