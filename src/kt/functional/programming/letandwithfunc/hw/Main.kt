package kt.functional.programming.letandwithfunc.hw

val list: MutableList<Int>? = null

fun main(args: Array<String>) {
    list?.let {
        with(it) {
            repeat(1000) { add((Math.random() * 1000).toInt()) }
            take(100).forEach { println(it) }
        }
    }
}
