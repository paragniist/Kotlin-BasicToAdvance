////BASICS OF FUNCTION

/*fun getGreeting():String{// return type is String here
    return "Hello KotlinNNNN"
}*/

/*fun getGreeting():String?{// return type is null here
    return null
}*/

//can also write below fun in one single statement also
/*
fun getGreeting():String?{// return type is null here
    return null
}*/
fun getGreeting() = "Hello Kotlinn" // here come type inference into the play, here we remove type String also :)



fun sayHello(){//bcz we don't want to return anything
println(getGreeting())
}

fun main(){// when we notice here, the main method return type is nothing here, hence if we want to explicitly say return type is nothing then we use the Unit keyword,(which mean return nothing)

    println("Hello World")
    println(getGreeting())
    sayHello()
}

//// HOW WE DEFINE FUNCTIONS PARAMETER'S