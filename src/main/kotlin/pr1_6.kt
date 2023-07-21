


fun add(a: Double, b: Double ): Double {
    return a + b
}

fun subtract(a: Double, b: Double): Double {
    return a - b
}

fun multiply(a: Double, b: Double): Double {
    return a * b
}

fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("Cannot divide by zero.")
    }
    return a / b
}

fun main() {
    val number1 = 10.0
    val number2 = 5.0


    println("Addition of $number1,$number2 is : ${add(number1, number2)}")
    println("Subtraction of $number1,$number2 is: ${subtract(number1, number2,)}")
    println("Multiplication of $number1,$number2 is: ${multiply(number1, number2)}")
    println("Division of $number1,$number2 is : ${divide(number1, number2)}")
}