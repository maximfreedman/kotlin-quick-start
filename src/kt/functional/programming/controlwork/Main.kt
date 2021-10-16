package kt.functional.programming.controlwork

fun main(args: Array<String>) {
    val data = mapOf(
        "January" to listOf(100, 100, 100, 100),
        "February" to listOf(200, 200, -190, 200),
        "March" to listOf(300, 180, 300, 100),
        "April" to listOf(250, -250, 100, 300),
        "May" to listOf(200, 100, 400, 300),
        "June" to listOf(200, 100, 300, 300)
    )

    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val correctData = data.filter { it -> it.value.all { it >= 0 } }
    val incorrectData = data.filter { it -> it.value.any { it < 0 } }.map { it.key }
    val sumsPerMonth = correctData.map { it.value.sum() }
    val max = sumsPerMonth.maxOrNull()
    val min = sumsPerMonth.minOrNull()

    println("Average amount per week ${correctData.flatMap { it.value }.average()}")
    println("Average amount per month ${sumsPerMonth.average()}")
    println("Maximum amount was $max")
    println(
        "Maximum amount was in month ${
            correctData.filter { it.value.sum() == max }.firstNotNullOfOrNull { it.key }
        }"
    )
    println("Minimum amount was $min")
    println(
        "Minimum amount was in month ${
            correctData.filter { it.value.sum() == min }.firstNotNullOfOrNull { it.key }
        }"
    )

    println("Errors was in next months $incorrectData")
}


