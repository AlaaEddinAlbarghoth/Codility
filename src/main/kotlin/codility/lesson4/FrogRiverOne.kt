package codility.lesson4

import codility.utils.printArray

/**
 * Example: A[0] = 1, A[1] = 3, A[2] = 1, A[3] = 4, A[4] = 2, A[5] = 3, A[6] = 5, A[7] = 4  ==(Result)==> 6
 * */
/* Find the earliest time when a frog can jump to the other side of a river. */
fun frogRiverOne(x: Int, a: IntArray): Int {
    val list = arrayListOf<Int>()

    // Fill the list with numbers from 1 until x
    for (i in 1..x)
        list.add(i)

    println("Array a: ")
    printArray(a)

    // Loop over the given array of our list elements
    for (i in a.indices) {

        // Check if any element of our list exist in the given array
        if (list.contains(a[i]))
            list.remove(a[i])

        if (list.isEmpty()) {
            // Print the result
            println("Earliest time leaves appear in is $i")
            return i
        }
    }

    return -1
}
