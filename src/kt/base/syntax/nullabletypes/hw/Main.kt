package kt.base.syntax.nullabletypes.hw

private var str1: String? = "str1"
private var str2: String? = null
private var str3: String? = "str3"

fun main(args: Array<String>) {
    val res = (str1?.length ?: 0) + (str2?.length ?: 0) + (str3?.length ?: 0)
    println(res)
}
