package kt.base.syntax.functions.hw

fun main(args: Array<String>) {
    println(sort(mutableListOf(1, 4, 2, 9, 6)))
    println(sort(mutableListOf(9, 8, 6, 1, 3, 5, 6)))
}

fun sort(list: MutableList<Int>): List<Int> {
    for (i in list.size - 1 downTo 0) {
        for (j in list.size - 1 downTo list.size - i) {
            if (list[j] < list[j - 1]) {
                val tmp = list[j]
                list[j] = list[j - 1]
                list[j - 1] = tmp
            }
        }
    }
    return list
}
