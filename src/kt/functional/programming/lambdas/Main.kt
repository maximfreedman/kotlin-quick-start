package kt.functional.programming.lambdas

fun main(args: Array<String>) {
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println(sum(1, 2))
}
