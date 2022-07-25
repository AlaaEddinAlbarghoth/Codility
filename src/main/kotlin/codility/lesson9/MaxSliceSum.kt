package codility.lesson9

import kotlin.math.max

fun maxSliceSum(a: IntArray): Int {

    // Because the elements might be negative, we initialize sum to min value and max sum to max value
    var sum = Long.MIN_VALUE
    var maxSum = Long.MIN_VALUE

    for (element in a) {
        // Bcz the element might be negative
        sum = max(element.toLong(), sum + element.toLong())
        maxSum = max(maxSum, sum)
    }

    return maxSum.toInt()
}
