package rsk

fun main(args: Array<String>) {
    var ints = listOf<Int>(1, 2, 3, 4, 5, 6)

//    filter method uses a lambda function to filter and return results
    val smallInts = ints.filter { it < 4 }

    for(i: Int in smallInts) println(i)

//    take one incoming data and transforming it
    val squareInts = ints.map { it * it }
    for (i: Int in squareInts) println(i)

//    combine both
    val smallSquareInts = ints
        .filter { it < 5 }
        .map { it * it }

    for (i: Int in smallSquareInts) println(i)

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"), Meeting(3, "Commoners"))

//    using map to transform data type -> from list of meeting to list of string
    val title = meetings
        .filter { it -> it.title.startsWith("C") }
        .map { m -> m.title }
    for (t in title) println(t)
}

class Meeting(val id: Int, val title: String) {
    val people = listOf(Person("Sam"), Person("Amigos"))
}

data class Person(val name: String){

}