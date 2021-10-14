package kt.base.syntax.conditionaloperators

fun main(args: Array<String>) {
    val money = 200
    val res = if (money > 500) {
        "you can buy pizza"
    } else if (money > 200) {
        "you can buy shaurma"
    } else {
        "you can buy doshirak"
    }
}
