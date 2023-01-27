fun main(){

    var modelInt: Car<Int> = Car(1345)
    var modelString: Car<String> = Car("BMW 1902")

}

class Car<T>(model:T){

    var make:T = model
    init {
        this.make = model
        println("The model is $model")
    }

}