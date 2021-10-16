package kt.functional.programming.extensionfunc

import java.math.BigInteger

fun main(args: Array<String>) {
    val age = 29
    println(age.compareAge())
    println(age.isPrimeNumber())
    val list: MutableList<Int>? = mutableListOf()

    list?.let {
        val x = myWith(it) {
            add(1)
            add(2)
            maxOf { it }
            minOf { it }
        }
        println(x)
    }
}

fun Int.compareAge() = this in 12..100

fun Int.isPrimeNumber() = BigInteger(this.toString()).isProbablePrime(this)

inline fun <T, R> myWith(value: T, block: T.() -> R): R = block(value)

