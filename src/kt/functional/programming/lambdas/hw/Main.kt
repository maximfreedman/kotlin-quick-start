package kt.functional.programming.lambdas.hw

fun main(args: Array<String>) {
    println(square(2))
    println(perimeter(2, 2))
    say_hello("maxim")
    sort_desc(arrayOf(1, 2, 3)).forEach { println(it) }
}

// only if function have one argument
//val square: (Int) -> Int = { it * it }

val square: (Int) -> Int = { a -> a * a }

val perimeter: (Int, Int) -> Int = { a, b -> a * b }

val say_hello: (String) -> Unit = { println("hello $it")}

val sort_desc: (Array<Int>) -> Array<Int> = {it.sortedArrayDescending()}

