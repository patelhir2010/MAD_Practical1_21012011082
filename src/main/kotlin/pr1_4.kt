fun main(args: Array<String>) {
    println("Enter the Number: ")
    val number = readln()!!.toInt()


    // Check if the number is even
    if (number % 2 == 0) {
        println("The number $number is even.")
    } else {
        println("The number $number is odd.")
    }
}