fun main(){

    try {
        val data = 20 / 0
    }catch (e: ArithmeticException){
        println(e)
    }
    println("")
    println("Code below the exception")

    val str = getNumber("6516")
    println(str)

}

fun getNumber(str:String): Int{
    return try{
        Integer.parseInt(str)
    } catch (e:NumberFormatException){
        0
    }

}