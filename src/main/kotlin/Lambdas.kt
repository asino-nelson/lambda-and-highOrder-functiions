fun main(){
    val myLambda: (Int) -> Unit = {s: Int -> println(s) }
    addNumber(5,7, myLambda)
}

// lambda function
fun addNumber(a:Int, b:Int,myLambda: (Int) -> Unit){
    val add = a + b
    println(add)
}

