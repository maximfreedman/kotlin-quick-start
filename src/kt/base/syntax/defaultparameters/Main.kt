package kt.base.syntax.defaultparameters

fun main(args: Array<String>) {

}

fun printInf(fName: String, lName: String, patronymic: String = "default") {
    println("firstname: $fName lastname: $lName patronymic: $patronymic")
}
