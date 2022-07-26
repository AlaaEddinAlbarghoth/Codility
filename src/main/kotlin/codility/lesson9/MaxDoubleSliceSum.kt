package codility.lesson9

import kotlin.math.max

/*
* Find the maximal sum of any double slice.
* */

/**
 * A = [3, 2, 6, -1, 4, 5, -1, 2], Result ==> 17
 * */
fun maxDoubleSliceSum(a: IntArray): Int {

    // The array will be split at "Y"
    // Find "maxLeft" and "maxRight"
    val maxLeft = IntArray(a.size) { 0 }
    val maxRight = IntArray(a.size) { 0 }

    // Max left starting from 1...N-1
    for (i in 1 until a.size) {
        println()
        println("i = $i")
        println("a = 0")
        println("b = ${maxLeft[i - 1] + a[i]}")
        maxLeft[i] = max(0, maxLeft[i - 1] + a[i])
        println("maxLeft = ${maxLeft[i]}")
    }
    println("=================")

    // Max right starting from N-2..0
    for (i in a.size - 2 downTo 0) {
        println()
        println("i = $i")
        println("a = 0")
        println("b = ${maxRight[i + 1] + a[i]}")
        maxRight[i] = max(0, maxRight[i + 1] + a[i])
        println("maxRight = ${maxRight[i]}")
    }
    println("=================")

    var maxDoubleSlice = 0
    for (i in 1 until a.size - 1) {
        println()
        println("maxLeft[i - 1] + maxRight[i + 1] = ${maxLeft[i - 1] + maxRight[i + 1]}")
        println("maxDoubleSlice = $maxDoubleSlice")
        maxDoubleSlice = max(maxLeft[i - 1] + maxRight[i + 1], maxDoubleSlice)
    }
    println()

    return maxDoubleSlice
}
