fun main() {
    val myAge:(Int,Int)-> Int = {currentYear, yearOfBirth -> currentYear-yearOfBirth}
    yearCalculator(2023,2003, myAge)
}

fun yearCalculator(currentYear:Int, yearOfBirth:Int, myAge:(Int,Int)-> Int){
    val age = myAge(currentYear, yearOfBirth)
    println(age)
}