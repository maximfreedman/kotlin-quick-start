package kt.functional.programming.creatinghigherorderfunc.hw

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    sum(list) { println(it.sum()) }
}

inline fun sum(collection: Collection<Int>, supplier: (Collection<Int>) -> Unit) = supplier(collection)
