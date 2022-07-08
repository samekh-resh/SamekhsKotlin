package course.WorkingWithClasses

fun sayHello(greeting:String, vararg itemsToGreet: String){
    itemsToGreet.forEach { itemToGreet -> println("$greeting $itemToGreet") }
}
//    naming params for default values if nothing is entered
fun greetPerson(greeting:String = "hiiii", name: String = "kotlin") = println("$greeting $name")
fun main() {

    greetPerson(name = "samekh")
//    naming parameters for specificity
//    greetPerson(name ="mark", greeting = "hi")
}