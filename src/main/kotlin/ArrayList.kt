fun main(){

    val arrayList = ArrayList<String>(5)
    arrayList.add("One")
    arrayList.add("Two")
    arrayList.add("Three")
    arrayList.add("Four")
    arrayList.add("Five")

    for(i in arrayList){
        println(i)
    }
    println("size of arrayList is ${arrayList.size}")
}