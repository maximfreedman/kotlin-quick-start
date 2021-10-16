package kt.functional.programming.letandwithfunc

var name: String? = "Hello"

fun main(args: Array<String>) {
//    var name: String? = null
//    if (name == null) {
//        return
//    }

//    if (name?.length?.compareTo(5) == 1) {
//        println("str")
//    }

    name?.let {
        if (it.length >= 5) {
            println(it)
        }
    }

    val list = generateSequence { Math.random() * 100 }.take(10).toList()
    with(list) {
        println(maxOf { it })
        println(minOf { it })
        println(sum())
        println(average())
    }
}
