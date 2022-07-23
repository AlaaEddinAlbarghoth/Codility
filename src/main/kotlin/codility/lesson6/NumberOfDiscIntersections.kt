package codility.lesson6

import codility.utils.printArray

/**
 *  A[0] = 1, A[1] = 5, A[2] = 2, A[3] = 1, A[4] = 4, A[5] = 0,  Result ==> 11
 * */
/* Compute the number of intersections in a sequence of discs. */
fun numberOfDiscIntersections(a: IntArray): Int {

    // main idea:
    // 1. store all the "lower points" and "upper points" of the discs
    // 2. count the intersections (if one upper point > one lower point)

    // note: use "long" for big numbers (be careful)
    val lower = LongArray(a.size) // Lower point of each disk
    val upper = LongArray(a.size) // Upper point of each disk

    for (i in a.indices) {
        lower[i] = i - a[i].toLong() // note: lower = center - A[i]
        upper[i] = i + a[i].toLong() // note: upper = center + A[i]
    }

    println("lower")
    printArray(lower)
    println("upper")
    printArray(upper)

    // "sort" the "lower points" and "upper points"
    lower.sort()
    upper.sort()

    var intersection = 0 // number of intersections
    var j = 0 // for the lower points

    for (i in a.indices) {
        println("i= $i")
        while (j < a.size && upper[i] >= lower[j]) {
            println("j= $j")
            intersection += j // add j intersections
            println("intersection + j= $intersection")
            intersection -= i // minus "i" (avoid double count)
            println("intersection - i= $intersection")
            j++
        }
    }

    // for the overflow cases
    if (intersection > 10_000_000)
        return -1

    return intersection
}
