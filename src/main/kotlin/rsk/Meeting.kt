package rsk

fun main(args: Array<String>) {
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"), Meeting(3, "Commoners"))

//    extracting all people using map
//    flatMap flatten collection into a single collection
    val people = meetings
        .flatMap(Meeting::people)
//            distinct returns a distinct set of collection, but it relies on a hashCode -> make person a data class
        .distinct()
    for(p in people) println(p.name)
}