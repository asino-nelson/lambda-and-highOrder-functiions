fun main() {

    var box: String? = "Not empty"
    if (box != null){
        println("${box.length}")
    }

    var carModel: String? = "Mazda"
    if (carModel !is String){
        println("Car model is unknown")
    }else{
        println("Car model is $carModel")
    }



}