fun main(args: Array<String>) {
    // Prompt the user to enter the student's information.
    println("Enter the Student Enrollment No: ")
    val No = readLine()!!.toInt()
    println("Enter the student Name: ")
    val name = readLine()!!
    println("Enter the student Branch: ")
    val branch = readLine()!!
    println("Enter the student Class: ")
    val Class = readLine()!!
    println("Enter the student Batch: ")
    val Batch = readLine()!!
    println("Enter the student college name: ")
    val college_name = readln()!!
    println("Enter the student University name: ")
    val University_name = readLine()!!
    println("Enter the student Age: ")
    val Age = readln()!!.toInt()

    println("\n**************************\n")

    println("Student's Data:")
    println("Enrollment No: $No")
    println("Name: $name")
    println("Age: $Age")
    println("Branch: $branch")
    println("Class: $Class")
    println("Batch: $Batch")
    println("College Name: $college_name")
    println("University name: $University_name")
}