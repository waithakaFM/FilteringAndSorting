package rsk

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5, 19, 20, 26)
//    declare predicate as variable
    val greaterThanThree = { v:Int -> v > 3}

//    these are predicates, return true or false
    var largeInts = ints.all ( greaterThanThree )
    println(largeInts)

    largeInts = ints.any (greaterThanThree)
    println(largeInts)

    var numberOfLargeInts = ints.count { it > 7 }
    println(numberOfLargeInts)


    var found = ints.find(greaterThanThree)
    println(found)

}