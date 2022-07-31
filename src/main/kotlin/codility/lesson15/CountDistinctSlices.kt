package codility.lesson15

/*
* Count the number of distinct slices (containing only unique numbers).
* */
/**
 * Example: 3, 4, 5, 5, 2
 * */
fun countDistinctSlices(m: Int, a: IntArray): Int {

    val seen = BooleanArray(m + 1) { false }

    // main idea:
    // use "boolean[]" to record if an integer is already seen
    // also use "leftEnd" and "rightEnd"

    var leftEnd = 0
    var rightEnd = 0
    var numSlice = 0

    // key point: move the "leftEnd" and "rightEnd" of a slice
    while (leftEnd < a.size && rightEnd < a.size) // 3, 4, 5, 5, 2

        if (!seen[a[rightEnd]]) { // case 1: distinct (rightEnd)
            // note: not just +1
            // there could be (rightEnd - leftEnd + 1) combinations (be careful)
            numSlice += rightEnd - leftEnd + 1

            if (numSlice > 1_000_000_000) return 1_000_000_000

            // increase the slice to right by "1" (important)
            seen[a[rightEnd]] = true
            rightEnd++
        } else {  // case 2: not distinct
            // decrease the slice from left by "1" (important)
            // remove A[leftEnd] from "seen" (be careful)
            seen[a[leftEnd]] = false
            leftEnd++
        }

    return numSlice
}
