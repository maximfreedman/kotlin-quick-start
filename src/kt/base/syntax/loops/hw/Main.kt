package kt.base.syntax.loops.hw

fun main(args: Array<String>) {
    val nulls = arrayOfNulls<Int?>(301)
    for ((index, i) in (300..600).withIndex()) {
        nulls[index] = i
    }

    for (i in nulls.size - 1 downTo 0 step 5) {
        println(nulls[i])
    }
}
