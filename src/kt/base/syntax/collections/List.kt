package kt.base.syntax.collections

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3, 4)
    //compile time error
//    list1.add(5)

    val list2 = mutableListOf(1, 2, 3, 4)
    list2.add(5)
}
