package codility.lesson14

import codility.utils.printArray
import kotlin.math.max

/*
* Divide array A into K blocks and minimize the largest sum of any block.
* */
/*
* Example: [2, 1, 5, 1, 2, 2, 2]
* */
fun minMaxDivision(k: Int, m: Int, a: IntArray): Int {

    // Get the minimum sum block depending on the summation of the blocks

    // We assume that the "min max Sum" will be
    // between "min" and "max" , each time we try "mid"

    printArray(a)

    var minSum = 0
    var maxSum = 0
    for (i in a.indices) {
        maxSum += a[i]              // Sum of all elements
        minSum = max(minSum, a[i])  // At least one max element
    }

    var possibleResult = maxSum     // The max one must be an "ok" result

    // Do "binary search" (search for better Sum)
    while (minSum <= maxSum) {
        // Define "mid" (binary search)
        val midSum = (minSum + maxSum) / 2

        // check if it can be divided by using
        // the minMaxSum = "mid", into K blocks ?
        val ok: Boolean = checkDivisible(midSum, k, a)

        // if "ok", means that we can try "smaller"
        // otherwise ("not ok"), we have to try "bigger"
        if (ok) {
            possibleResult = midSum // mid is "ok"
            // we can try "smaller"
            maxSum = midSum - 1
        } else { // "not ok"
            // we have to try "bigger"
            minSum = midSum + 1
        }
        // go back to "binary search" until "min > max"
    }

    return possibleResult
}

// check if it can be divided by using the minMaxSum = "mid", into K blocks ?
fun checkDivisible(mid: Int, k: Int, a: IntArray): Boolean {
    var numBlockAllowed = k
    var currentBlockSum = 0

    for (i in a.indices) {
        currentBlockSum += a[i]
        if (currentBlockSum > mid) { // means: need one more block
            numBlockAllowed--
            currentBlockSum = a[i] // note: next block
        }
        // cannot achieve minMaxSum = "mid"
        if (numBlockAllowed == 0) return false
    }

    // can achieve minMaxSum = "mid"
    return true
}
