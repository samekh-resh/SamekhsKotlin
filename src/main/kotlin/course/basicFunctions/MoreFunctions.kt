package course.basicFunctions
//defining a function parameter
fun sayHello( greeting:String, itemToGreet:String) {
    println("hello $itemToGreet")
}
fun main() {

    sayHello("hey","kotlin")
    sayHello("hello","world")
    sayHelloThere("noWOOOORDs")

}