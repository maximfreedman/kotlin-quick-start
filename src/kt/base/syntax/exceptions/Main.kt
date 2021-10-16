package kt.base.syntax.exceptions

fun main(args: Array<String>) {
    println(sum("1", "2"))
    println(sum("1", "abc"))
}

fun sum(a: String, b: String) = try {
    a.toInt() + b.toInt()
} catch (e: Exception) {
    0
}
