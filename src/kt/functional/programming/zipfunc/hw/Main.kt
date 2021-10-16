package kt.functional.programming.zipfunc.hw

fun main(args: Array<String>) {
    val names = listOf("Maxim Fishin", "Veronika Alekseinko", "Denis Zybchevskiy")
    val splits = names.map { it.split(" ".toRegex()) }
    splits.zip(splits) { n, _ -> Pair(n[0], n[1]) }.forEach { println(it) }
}
