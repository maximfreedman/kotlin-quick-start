package kt.base.syntax.variables

fun main(args: Array<String>) {
    //like a final variable in java
    val name = "Max"
    var age = 21
    age = 22
    //compile time error
//    name = "Ivan"
    println(name)
    println(age)
}