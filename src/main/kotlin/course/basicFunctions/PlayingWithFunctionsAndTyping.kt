package course.basicFunctions

//a single expressionFunction
fun getGreeting() = "hello Kotlin"
//we can use the UNit type for when we don't know what the value is or don't care, or don't really need it
fun sayHelloThere(word: String): Unit{
    println(word)
}


fun main(){
    println("hello world")
    println(getGreeting())
    sayHelloThere("whoa")
}