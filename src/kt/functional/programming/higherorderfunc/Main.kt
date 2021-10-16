package kt.functional.programming.higherorderfunc

fun main(args: Array<String>) {
    val res = listOf("andrew", "maxim", "anna", "john").filter { it.startsWith('a') }.sorted()
    res.forEach { println(it) }
}
