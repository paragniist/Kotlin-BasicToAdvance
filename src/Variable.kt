val name: String = "Nate"
//var greetings: String = "hello"//program 4
var greetings: String? = "go to hell"//program 5, 6


fun main(){
    //1st PGM
    //println("Hello Kotlin")

    //2nd PGM
    //val name:String = "Name"
    //when try to update variable name, we will get error
    //name = ""
    /*error::: Val cannot be reassigned*/

    //3rd PGM
    //var name1:String = "Name"
    //name1="hi"
    //println(name1)
    //var can be re-assigned
    //output//
/*
    Hello Kotlin
            hi
*/
    //4th PGM



//program4()

//program5()

program6()

// program7()
}

fun program7() {
    //FLOW CONTROL DEMO with "when" statement :: when is very similar to "switch" in java

    greetings = null
    when(greetings){
        null -> println("Hi")
        else -> println(greetings)

    }
}
fun program6() {
     //FLOW CONTROL DEMO with IF ELSE

  /*  //EG1
    if(greetings != null){
        println(greetings)
    }else{
        println("Hi")
    }
    println(name)*/

    //EG2

    val greetingToPrint = if (greetings != null) greetings else "Hi"
    println(greetingToPrint)
    println(name)



}

fun program5() {
/*    IMP NOTE:: One interesting difference between Java and Kotlin is the types in Kotlin
      are not null by default, which mean there is a distinct difference between a Sting and a nullable string.
here is below eg,
val name: String = "Nate" // name is a non null string
val name: String = null // when we try to assign null to string, a null can't be a value of Not Null type string
// wen we want our varilable to hold a null type the we write as below
// -->> val name: String? = null // correct syntax
var greetings: String = "hello"*/

    println(greetings)
    println(name)

    greetings = null
    println(greetings)
    println(name)

//    NOte: Kotlin provides type inference
    /*
    * val name:String="Nate" or val name = "Nate"
    * var greetings:String? = null // if we want null, this is the only way we left wit, here this //var abc=null// will not work
    *
    * */



}

fun program4(){
    println(greetings)
    println(name)

    greetings = "modified greetings variable text"
    println(greetings)
    println(name)

}