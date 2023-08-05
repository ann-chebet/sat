fun main() {
    val marks = 50
    val grade: String
    grade = if(marks >= 90)
        "A+"
    else if(marks >= 75)
        "A"
    else if(marks >= 65)
        "B+"
    else if(marks >= 55)
        "B"
    else if(marks >= 45)
        "C+"
    else if(marks >= 35)
        "C"
    else if(marks >= 30)
        "D"
    else
        "F"
    println("Your grade is: $grade")
}
