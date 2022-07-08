package course.workingWithClasses

fun sayHello(greeting:String, vararg itemsToGreet: String){
    itemsToGreet.forEach { itemToGreet: String -> println("$greeting $itemToGreet") }
}
//    naming params for default values if nothing is entered
fun greetPerson(greeting:String = "hiiii", name: String = "kotlin") = println("$greeting $name")
fun main() {

   val person = Person("samekh", "resh")
//    naming parameters for specificity
//    greetPerson(name ="mark", greeting = "hi")
}