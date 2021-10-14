package kt.base.syntax.nullabletypes

//compile time error
//private var name: String = null

//nullable type
private var name: String? = null

fun main(args: Array<String>) {
    //null
    println(name?.length)

    //Elvis operator ?:
    val len = name?.length ?: 0
    println(len)

    //NPE
    println(name!!.length)
}
