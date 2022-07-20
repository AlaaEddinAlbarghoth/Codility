package codility.lesson2

import java.lang.Exception

/**
 * Examples:
 * A[0] = 9  A[1] = 3  A[2] = 9
 * A[3] = 3  A[4] = 9  A[5] = 7
 * A[6] = 9
 * ==> The function should return 7
 * */
/* Find value that occurs in odd number of elements. */
fun oddOccurrencesInArray(a: IntArray): Int {

    // Special case the array must be odd
    if (a.size % 1 == 1)
        throw Exception("Array size not Odd!")

    // Special case the array is empty
    if (a.isEmpty())
        return 0

    // Define unpaired variable to save the unpaired value
    var unpaired: Int = a[0]

    for (i in 1 until a.size)
        unpaired = unpaired xor a[i]

    // Print Unpaired value
    println("Unpaired value is {$unpaired}")

    return unpaired
}
