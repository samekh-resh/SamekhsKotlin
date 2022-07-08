package course.collectionsANdIterations
    val interestingThings = arrayOf("kotlin", "dick", "acting")
    val greetings = listOf("coding", "Film", "exercise")
    val moreThings = listOf("film", "cute guys", "really thick dicks with the hands gripping me")
    val newerList = mutableListOf(moreThings)
    val map = mapOf(1 to "ginger guys", 2 to "washboard abs", 3 to "calling me a hottie")
    val newMap = mutableMapOf<Int,String>()

fun sayHello( greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")


fun main() {
    println("working with array")
    workingWithArrays(interestingThings)
    println("working with map")
    workingWithMaps(newMap)




}

fun workingWithMaps(something:MutableMap<Int, String>){

    something.putAll(map)
    something[4] = "tight wet pussy on a cute guy"
//    something.put(4, "tight wet pussy on a cute guy") not the best practice to use, this get it by the assignment
    something.forEach { (t, u) -> println("$t ---> $u") }
}

fun workingWithArrays(something:Array<String>){
    something.forEach {item ->
        println("$item is printed from the array withForEach{} method")
    }
    something.forEachIndexed { index, s -> println("$s is at $index, printed with forEachIndexed{} ") }
}