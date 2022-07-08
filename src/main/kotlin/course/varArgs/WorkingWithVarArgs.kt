package course.varArgs

val interestingThings = arrayOf("kotlin", "exercise", "acting")
val greetings = listOf("coding", "Film", "exercise")
val moreThings = listOf("film", "cute guys", "really thick dicks with the hands gripping me")
/**
//val newerList = mutableListOf(moreThings)
//val map = mapOf(1 to "ginger guys", 2 to "washboard abs", 3 to "calling me a hottie")
//figure out a way to play with varArgs and Map Val
// val newMap = mutableMapOf<Int,String>()
*/

//the weird thing Bout varArgs is that it expects the incoming value to be an Array<t> of something, so varArgs won't take lists or Maps or other collections.
fun sayHello( greeting:List<String>, vararg itemToGreet:String?) = greeting.forEachIndexed { index, s ->
//    to check if it's empty/null/ since you have to specify a null type in Kotlin
    if (itemToGreet.isEmpty()) {
        println("$s favorite thing I could not place")
    } else if (itemToGreet[index]==null) {
        println("$s couldn't fine")
    } else {
        println("$s  ${itemToGreet[index]}")
    }
}

fun sayHelloAgain(greeting:String, vararg itemsToGreet:String){
    itemsToGreet.forEach { itemToGreet -> println("$greeting $itemToGreet") }
}

fun main() {
//    sayHello(greetings, moreThings/**/)
//    sayHello(greetings, "wassup")
//    working with varArgs basic
    sayHelloAgain("hello", "trash", "life", "love")

}