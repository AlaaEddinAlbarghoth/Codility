package codility.lesson6

import kotlin.math.max

/**
 * Example: A[0] = -3, A[1] = 1, A[2] = 2, A[3] = -2, A[4] = 5, A[5] = 6 ==(Result)==> 60
 */
/*
    Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
 */
fun maxProductOfThree(a: IntArray): Int {

    // Main Idea:
    // max1 = positive * positive * positive
    // max2 = negative * negative * positive
    // max = max (max1, max2)
    // and just need to sort the array first to take the biggest numbers from each side

    // 1- Sort the array
    a.sort()

    // Max1
    val max1 = a[a.size - 3] * a[a.size - 2] * a[a.size - 1]
    val max2 = a[0] * a[1] * a[a.size - 1]

    return max(max1, max2)
}
