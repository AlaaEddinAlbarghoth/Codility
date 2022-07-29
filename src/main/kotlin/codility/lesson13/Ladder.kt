package codility.lesson13

import kotlin.math.max


/*
* Count the number of different ways of climbing to the top of a ladder.
* */
/**
 * Example:
 * A[0] = 4   B[0] = 3
 * A[1] = 4   B[1] = 2
 * A[2] = 5   B[2] = 4
 * A[3] = 5   B[3] = 3
 * A[4] = 1   B[4] = 1
 *
 * Result => [5, 1, 8, 0, 1]
 * */
fun ladder(a: IntArray, b: IntArray): IntArray {

    val l: Int = a.size

    // Determine the "max" for Fibonacci
    var max = 0
    for (i in 0 until l)
        max = max(a[i], max)

    //max += 2; // for Fibonacci
    val fibonacci = IntArray(max + 1) // plus one for "0"

    // initial setting of Fibonacci (important)
    fibonacci[0] = 1
    fibonacci[1] = 1

    // we want to find the result of "a number modulo 2^P"
    // if we first let the number modulo 2^Q (Q > P)
    // then, modulo 2^P, the result is the same.
    // So, "we first modulo 2^30" to avoid overflow
    // where, 2^30 == 1 << 30
    for (i in 2..max)
        fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % (1 shl max + 1)

    // to find "results"
    val results = IntArray(l)

    // where, "1 << B[i]" means 2^B[i]
    for (i in 0 until l)
        results[i] = fibonacci[a[i]] % (1 shl b[i])

    return results
}
