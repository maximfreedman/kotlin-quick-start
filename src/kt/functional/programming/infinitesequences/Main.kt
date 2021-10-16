package kt.functional.programming.infinitesequences

fun main(args: Array<String>) {
    val arr = generateSequence(1) { it * 2 }

    arr.take(10).forEach { println(it) }
}
