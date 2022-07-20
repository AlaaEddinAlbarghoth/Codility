package codility.lesson2

import codility.utils.printArray

/*
* Examples: A = [3, 8, 9, 7, 6], K = 3 ==(Result)==> [9, 7, 6, 3, 8]
* */
fun cyclicRotation(a: IntArray, k: Int): IntArray {
    if (a.isEmpty())
        throw Exception("Array Empty!")

    // Print Current Array
    printArray(a)

    // Define a new array to save the new contents
    val newArray = IntArray(a.size)

    // Shift the current array, and fill the new one
    for (i in a.indices) {
        // 1- Calculate the new index
        val newPosition = (i + k) % a.size

        // 2- Assign the new value in that index
        newArray[newPosition] = a[i]
    }

    // Print New Array
    printArray(newArray)

    // 3- Return the array
    return newArray
}