package kt.base.syntax.functions

fun main(args: Array<String>) {
    println(max(5, 10))
    println(getFirstFive("hello world"))
    println(sum(1, 2, 3, 45))
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun getFirstFive(str: String) = str.substring(0, 5)

fun sum(vararg number: Int) = number.sum()
