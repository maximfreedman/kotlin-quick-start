package kt.functional.programming.flatmapfunc

fun main(args: Array<String>) {
    val l = mutableListOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
    val average = l.flatMap { it }.average()
    println(average)

    val m = mapOf(
        "file1" to listOf(1, 2, 3),
        "file2" to listOf(4, -1, 6),
        "file3" to listOf(7, 8, 9),
    )

    val average1 = m.filter { it -> it.value.all { it > 0 } }.flatMap { it.value }.average()

    println(average1)
}


