package kt.base.syntax.defaultparameters.hw

fun main(args: Array<String>) {
    println(v(3))
}

fun v(a: Int, b: Int = a, c: Int = a): Int = a * b * c
