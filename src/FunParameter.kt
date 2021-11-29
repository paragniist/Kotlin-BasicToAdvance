fun sayHello2(itemToGreet:String){
    //val  msg = "Hello " + itemToGreet
    //Kotlin also supports String template(///eg::: "$") which reduced the boilerplate code
    /*val  msg = "Hello  $itemToGreet"
    println(msg)*/

    //even we reduce the above 2 line into the one
    println("Hello  $itemToGreet")
}

fun sayHello3(greeting:String, itemToGreet:String) = println("$greeting  $itemToGreet") // more concise one with two parameter

fun main(){
    sayHello3("Namaste","Kotlin")
    sayHello2("World")
    sayHello2("India")


}