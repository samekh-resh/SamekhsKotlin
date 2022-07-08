package course.variables

//variables outside of functions and just on a file or class are called top level variables
//    read only variables unchangeable
val name: String = "samekh"
var nickName: String = "mekh"
var greeting: String? = "hello"
//you make a variable nullable by adding a questionmark after the type specification
//types in Kotlin are nonnull by default, meaning that you have to explicitly state if that variable has to take a value
fun main(){
//    playingWithVariables()
//    playingAroundWithStuffingFunctionsPLaces()


}

fun returnGreeting(greet:String?): String{
    var  madeGreeting = "default"
    madeGreeting = when(greet){
        null-> "hi"
        "hello"-> "hello to you too"
        "sup"-> "idk you like that"
        else -> "hello"
    }
//    worst practice
//    when(greet){
//        null->  madeGreeting = "hi"
//        "hello"-> madeGreeting = "hello to you too"
//        "sup"-> madeGreeting = "idk you like that"
//        else -> madeGreeting = "hello"
//    }
    return madeGreeting
}
fun playingWithVariables(){
    println(greeting)
    println(name)
    println(nickName)
    nickName = "sexy sammie"
    greeting = null
    println("$nickName says $greeting")
}

fun aWarmOrColdGreeting(){

    if(greeting!=null){
        println("$nickName says $greeting")
    }else{
        println("$name says hello...")
    }
}

fun playingAroundWithStuffingFunctionsPLaces(){
    var thisNumber: Int = mathFunction(2,3)
    var returnedGreeting: String = returnGreeting(greeting)
    println("$thisNumber is the number and $returnedGreeting is the greeting")
    thisNumber = mathFunction(4, 6)
    returnedGreeting = returnGreeting(null)
    println("$thisNumber is the number and $returnedGreeting is the greeting")
    thisNumber = mathFunction(10, 8)
    returnedGreeting = returnGreeting("sup")
    println("$thisNumber is the number and $returnedGreeting is the greeting")
}

fun mathFunction(num: Int, num2: Int): Int{
    var number = 0
    number = num + num2
    return number
}