package codility.lesson16

/*
 * Find a maximal set of non-overlapping segments.
 * */
/**
 * Example: [1, 3,  7, 9, 9], [5, 6, 8, 9, 10]
 *  A[0] = 1    B[0] = 5
 *  A[1] = 3    B[1] = 6
 *  A[2] = 7    B[2] = 8
 *  A[3] = 9    B[3] = 9
 *  A[4] = 9    B[4] = 10
 *  Result => 3
 * */
fun maxNonOverlappingSegments(a: IntArray, b: IntArray): Int {
    // main idea:
    // Using "greedy" method to find non-overlapping segments

    // because the segments are sorted by their rightEnds
    // we use "for loop" from rightEnd to left
    // and just need to keep the "value of leftEnd" (key point)

    // special case
    if (a.isEmpty())
        return 0

    val n: Int = a.size

    // keep the value of leftEnd: a[i]
    // the 1st segment: a[N-1]
    var currentLeftEnd = a[n - 1]
    var numNonOverlap = 1

    for (i in n - 2 downTo 0) {
        // if "rightEnd < leftEnd", nonOverlap++
        // and update the value of leftEnd
        if (b[i] < currentLeftEnd) {
            numNonOverlap++
            currentLeftEnd = a[i]
        }
        // if "leftEnd is shorter",
        // update the value of leftEnd (important)
        if (a[i] > currentLeftEnd) {
            currentLeftEnd = a[i]
        }
    }

    return numNonOverlap
}
