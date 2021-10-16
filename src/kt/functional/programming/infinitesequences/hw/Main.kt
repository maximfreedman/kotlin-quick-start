package kt.functional.programming.infinitesequences.hw


fun main(args: Array<String>) {
    val r = generateSequence("Сотрудник №1")
    { "Сотрудник №${(it.replace("Сотрудник №", "").toInt().inc())}" }

    r.take(10).forEach { println(it) }
}

