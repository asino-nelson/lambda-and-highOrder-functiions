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
    val id = getNumber("10003675")
    println(id)

}

fun getNumber(str:String): Int{
    return try{
        Integer.parseInt(str)
    } catch (e:NumberFormatException){
        0
    }

}

fun userID(id:String): Int{
    return try{
        Integer.parseInt(id)
    } catch (e:NumberFormatException){
        0
    }

}