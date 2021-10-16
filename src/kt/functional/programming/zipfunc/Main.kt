package kt.functional.programming.zipfunc

fun main(args: Array<String>) {
    val nums = mutableListOf<Long>()
    val names = mutableListOf<String>()

    for (i in 0..1000) {
        names.add("name$i")
        //generate rand phone num
        nums.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }

    val r = names zip nums

    r.forEach{ println(it)}
}




