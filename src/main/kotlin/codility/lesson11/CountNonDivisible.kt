package codility.lesson11

import kotlin.math.sqrt

/*
* Calculate the number of elements of an array that are not divisors of each element.
* */

/**
 * Example: [3 ,1 ,2 ,3 ,6]
 * */
fun countNonDivisible(a: IntArray): IntArray {

    // The Logic

    // region Solution 1
    //for (outer in a.indices) {
    //    for (inner in a.indices) {
    //        if (a[outer] % a[inner] != 0)
    //            result[outer]++
    //    }
    //}
    // endregion

    // region Solution 2

    // Using HashMap to count
    val counters = HashMap<Int, Int>()

    // Add all the numbers
    for (i in a.indices) {
        when {
            !counters.contains(a[i]) -> counters[a[i]] = 1
            else -> counters[a[i]] = counters[a[i]]?.plus(1) ?: 1
        }
    }

    // Results map, The output
    val divisorCounters = HashMap<Int, Int>()

    // Loop over the keys
    for (n in counters.keys) {

        // Divisor counter
        var divisorCounter = 0

        for (v in 1..sqrt(n.toFloat()).toInt())
            if (n % v == 0) {
                if (counters.contains(v))
                    divisorCounter += counters[v] ?: 0

                if (v < sqrt(n.toFloat()).toInt()) {
                    val opp = n / v
                    if (counters.contains(opp))
                        divisorCounter += counters[opp] ?: 0
                }
            }

        divisorCounters[n] = divisorCounter
    }
    // endregion

    return divisorCounters.values.toIntArray()
}
