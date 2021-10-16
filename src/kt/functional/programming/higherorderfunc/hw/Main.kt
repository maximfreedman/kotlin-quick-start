package kt.functional.programming.higherorderfunc.hw

fun main(args: Array<String>) {
    val res = (0..1000)
        .filter { it % 5 == 0 && it % 3 == 0 }
        .map { it * it }
        .sortedDescending()
        .map { it.toString() }
    res.forEach{ println(it)}
}


