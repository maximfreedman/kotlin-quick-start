package kt.base.syntax.whenoperator.hw

fun main(args: Array<String>) {
    val time = 10
    val weather = true
    val result = when {
        time in 6..18 && weather -> {
            "walk"
        }

        time in 6..18 && !weather -> {
            "read"
        }
        else -> {
            "sleep"
        }
    }
    println(result)
}
