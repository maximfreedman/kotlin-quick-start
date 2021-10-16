package kt.base.syntax.loops

fun main(args: Array<String>) {
    val ints = arrayOf(1, 2, 3, 4)
    for (i in ints) {
        println(i)
    }

    val nulls = arrayOfNulls<Int?>(10)

    for (i in nulls.indices) {
        nulls[i] = i
    }

    for (i in nulls) {
        println(i)
    }

    for (i in nulls.size -1 downTo 0) {
        println(i)
    }

    for ((index, i) in nulls.withIndex()) {
        nulls[index] = i?.plus(i)
        println(nulls[index])
    }
}
