package kt.base.syntax.whenoperator

fun main(args: Array<String>) {
    val nameOfMonth = "June"

    val season = when (nameOfMonth) {
        "June", "Jule", "August" -> {
            "summer"
        }
        "December", "November", "January" -> {
            "winter"
        }
        else -> {
            "not found"
        }
    }

    println(season)
}
