package kt.base.syntax.collections

fun main(args: Array<String>) {
    val arr: Array<Int?> = arrayOf(1, 2, 3, 4, 5, 6)
    val arr2 = arrayOf(1, 2, 3, 4, 5, 6)
    arr[1] = null
    //compile time error
//    arr2[1] = null
    println(arr[0])
}
