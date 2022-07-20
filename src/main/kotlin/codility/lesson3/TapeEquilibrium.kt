package codility.lesson3

import kotlin.math.abs
import kotlin.math.min

/**
 * A[0] = 3, A[1] = 1, A[2] = 2, A[3] = 4, A[4] = 3 ==(Result)==> 1
 * */
/* Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|. */
fun tapeEquilibrium(a: IntArray): Int {

    /* Define the vars we need them in this algorithm */
    /* We need the sum in later calculations */
    val sum = a.sum()
    /* The sum of the first part */
    var sumPart1 = 0
    /* The sum of the second part */
    var sumPart2 = 0
    /* The difference between part1 and part2 every time */
    var difference: Int
    /* The final result that contains min difference, it will be calculated after calculating the difference every time */
    var minDifference = Int.MAX_VALUE

    /* Start from index 1 to calculate part1 from index 1 and previous index */
    for (p in 1 until a.size) {
        sumPart1 += a[p - 1] // Calculating part1
        sumPart2 += sum - sumPart1// Calculating part2
        difference = abs(sumPart2 - sumPart1)// Calculating difference
        minDifference = min(minDifference, difference)// Calculating min difference
    }

    // Print min difference
    println("Minimal difference is {${minDifference}}")

    // Return the result
    return minDifference
}
