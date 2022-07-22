package codility.lesson5

import kotlin.math.min

/**
 *  A[0] = 4, A[1] = 2, A[2] = 2, A[3] = 5, A[4] = 1, A[5] = 5, A[6] = 8 ==(Result)==> 1
 * */
/*
* Find the minimal average of any slice containing at least two elements.
* */
fun minAvgTwoSlice(a: IntArray): Int {

    // The trick to this problem is
    // that the min average slice has "the length of 2 or 3"

    // To store min avg in our app
    var min: Float = Float.MAX_VALUE

    // The output of this algorithm (result)
    var minStartPos = 0

    for (i in 0 until a.size - 2) {

        val avg2 = ((a[i] + a[i + 1]) / 2).toFloat()
        val avg3 = ((a[i] + a[i + 1] + a[i + 2]) / 3).toFloat()

        val currentMinAvg = min(avg2, avg3)
        if (currentMinAvg < min) {
            min = currentMinAvg
            minStartPos = i + 1
        }
    }

    val avg2 = ((a[a.size - 2] + a[a.size - 1]) / 2)
    if (avg2 < min)
        minStartPos = a.size - 2

    return minStartPos
}
