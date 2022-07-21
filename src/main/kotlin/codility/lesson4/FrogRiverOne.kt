package codility.lesson4

import codility.utils.printArray

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
