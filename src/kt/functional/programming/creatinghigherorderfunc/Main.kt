package kt.functional.programming.creatinghigherorderfunc

fun main(args: Array<String>) {
    println(modifyStr("hello") { it.uppercase() })
}

fun modifyStr(str: String, modify: (String) -> String) = modify(str)
